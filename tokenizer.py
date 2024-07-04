syntax = {
    "{" : 1,
    "}" : 2,
    ";" : 3,
    "(" : 4,
    ")" : 5,
    "[" : 6,
    "]" : 7
}

keytokens = {
    "abstract" : 0,
    "do" : 0,
    "if" : 0,
    "package" : 0,	
    "synchronized" : 0,
    "boolean" : 0,
    "double" : 0,
    "implements" : 0,	
    "private" : 0,
    "this" : 0,
    "break": 0,
    "else" : 0,
    "import" : 0,
    "protected" : 0,
    "throw" : 0,
    "byte" : 0,
    "extends" : 0,
    "instanceof" : 0,
    "public" : 0,
    "throws" : 0,
    "case" : 0,
    "false" : 0,
    "int" : 0,
    "return" : 0,
    "catch" : 0,
    "final" : 0,
    "interface" : 0,
    "short" : 0,
    "true" : 0,
    "char" : 0,
    "finally" : 0,
    "long" : 0,
    "static" : 0,
    "try" : 0,
    "class" : 0,
    "float" : 0,
    "native" : 0,
    "strictfp" : 0,
    "void" : 0,
    "const" : 0,
    "for" : 0,
    "new" : 0,
    "super" : 0,
    "continue" : 0,
    "goto" : 0,
    "null" : 0,
    "switch" : 0,
    "while" : 0,
    "default" : 0,
    "assert" : 0,
}

from collections import namedtuple
from enum        import IntEnum

class TokenType(IntEnum):
    Keyword = 0
    Syntax  = 1
    Comment = 2
    StringLiteral = 3
    Unknown = 4

Token  = namedtuple('Token', ['type', 'value'])

def determine_type(value):
    if   value in syntax:
        return TokenType.Syntax
    elif value in keytokens:
        return TokenType.Keyword
    else:
        return TokenType.Unknown
    

class ParsingError(Exception):
    def __init__(self, message):            
        super().__init__(message)

class UsageError(Exception):
    def __init__(self, message):            
        super().__init__(message)

class  PreParser:
    def __init__(self, file_name):
        self.tokens = []
        self.value  = ""
        self.type   = TokenType.Unknown
        self.char   = 0
        self.file   = open(file_name)

    def __enter__(self):
        return self
    
    def __exit__(self, type, value, traceback):
        self.file.close()

    def get_result(self):
        return self.tokens
    
    def read_next_char(self):
        self.char = self.file.read(1)
        return self.char

    def peel_next_char(self):
        saved_char = self.char
        if not self.read_next_char():
            self.char, saved_char = saved_char, ''
        else:
            self.char, saved_char = saved_char, self.char
        self.file.seek(self.file.tell() - 1, 0)
        return saved_char

    def end_token(self):
        if not self.value:
            return False
        self.tokens.append( Token(self.type, self.value) )
        self.value = ""
        self.type = TokenType.Unknown
        return True

    def is_comment_start(self):
        next_char = self.peel_next_char()
        if next_char == '/' or next_char == '*':
            return True
        return False

    def collapse_comment(self):
        comment = ""
        if   self.char == '/':
            while self.read_next_char():
                if self.char == '\n':
                    self.value = comment
                    self.type  = TokenType.Comment
                    return       
                comment += self.char
        elif self.char == '*':
            while self.read_next_char():
                if self.char == '*':
                    self.read_next_char()
                    self.value = comment
                    self.type  = TokenType.Comment
                    return
                comment += self.char
        else:
            UsageError("PreParser.collapse_comments() shall be called when self.char is on the second symbol of an opening comment sequence.")
        raise ParsingError("Comment is not closed.")
    
    def collapse_string(self):
        string = ""
        while self.read_next_char():
            if self.char == '"':
                self.value = string
                self.type  = TokenType.StringLiteral
                return
            string += self.char
        raise ParsingError("String literal is not closed.")

    
    def parse(self):
        while self.read_next_char():
            if(self.char == '\n'):
                self.end_token()
                self.value = self.char
                self.end_token()

            if self.char.isspace():
                self.end_token()
                continue
 
            if(self.char in syntax):
                self.end_token()
                self.value = self.char
                self.end_token()
                continue

            if(self.char == '"'):
                self.collapse_string()
                self.end_token()
                continue

            if(self.char == "/"):
                if not self.is_comment_start():
                    continue
                self.read_next_char()
                self.collapse_comment()
                self.end_token()
                continue

            self.value += self.char
        else:
            self.end_token()   

class Parser:
    def __init__(self, tokens):
        self.tokens  = tokens
        self.result = []

    def __enter__(self):
        return self
    
    def __exit__(self, type, value, traceback):
        (...)

    def get_result(self):
        return self.result
    
    def parse(self):
        for t in self.tokens:
            if   t.type != TokenType.Unknown:
                self.result.append(t)
            elif t.value == "\n":
                continue
            else:
                self.result.append( Token(determine_type(t.value), t.value) )
