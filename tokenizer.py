syntax = {
    "{" : 1,
    "}" : 2,
    ";" : 3,
    "(" : 4,
    ")" : 5,
    "[" : 6,
    "]" : 7,
    "<" : 8,
    ">" : 9,
    "," : 10,
    "." : 11
}

keytokens = {
    "abstract" : 0,
    "do" : 0,
    "if" : 0,
    "package" : 0,	
    "synchronized" : 0,
    "implements" : 0,	
    "private" : 0,
    "this" : 0,
    "break": 0,
    "else" : 0,
    "import" : 0,
    "protected" : 0,
    "throw" : 0,
    "extends" : 0,
    "instanceof" : 0,
    "public" : 0,
    "throws" : 0,
    "case" : 0,
    "false" : 0,
    "return" : 0,
    "catch" : 0,
    "final" : 0,
    "interface" : 0,
    "short" : 0,
    "true" : 0,
    "finally" : 0,
    "static" : 0,
    "try" : 0,
    "class" : 0,
    "native" : 0,
    "strictfp" : 0,
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

buildin_types = {
    "boolean" : 0,
    "double" : 0,
    "float" : 0,
    "long" : 0,
    "char" : 0,
    "int" : 0,
    "void" : 0,
    "byte" : 0,
}

wrapper_types = {
    "Byte" : 0,
    "Short" : 0,
    "Integer" : 0,
    "Long" : 0,
    "Float" : 0,
    "Double" : 0,
    "Boolean" : 0,
    "Character" : 0
}



from collections import namedtuple
from enum        import IntEnum

class TokenType(IntEnum):
    Comment = 0
    Syntax  = 1
    Keyword = 40
    Library = 100
    BuildinType = 200
    Literal = 300
    StringLiteral = 500
    ReferenceType = 2000
    Unknown = 5000


Token  = namedtuple('Token', ['type', 'value'])

def determine_type(value):
    if   value in syntax:
        return TokenType.Syntax
    elif value in keytokens:
        return TokenType.Keyword
    elif value in buildin_types:
        return TokenType.BuildinType
    elif value in wrapper_types:
        return TokenType.ReferenceType
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

    def add_char(self):
        self.value += self.char

    def end_token(self):
        if not self.value:
            return False
        self.tokens.append( Token(self.type if self.type != TokenType.Unknown else determine_type(self.value), self.value) )
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
    
    def is_compare(self):
        if self.peel_next_char() == "=":
            return True
        return False

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
            if self.char.isspace():
                self.end_token()
                continue
 
            if(self.char in syntax):
                self.end_token()
                self.add_char()
                self.end_token()
                continue

            if(self.char == "!" or self.char == "="):
                self.add_char()
                self.type = TokenType.Syntax
                if self.is_compare():
                    self.read_next_char()
                    self.add_char()
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

            self.add_char()
        else:
            self.end_token()   

class Parser:
    def __init__(self, tokens):
        self.tokens  = tokens
        self.token   = None
        self.idx     = -1
        self.result  = []
        self.known_user_types = {};

    def __enter__(self):
        return self
    
    def __exit__(self, type, value, traceback):
        (...)

    def reset(self):
        self.idx   = -1
        self.token = None

    def next(self):
        if self.idx + 1 >= len(self.tokens):
            return None
        self.idx   = self.idx + 1
        self.token = self.tokens[self.idx]
        return self.token
        
    def prev(self):
        if self.idx - 1 < 0:
            return None
        self.idx   = self.idx - 1
        self.token = self.tokens[self.idx]
        return self.token

    def peel_next(self):
        if self.idx + 1 >= len(self.tokens):
            return None 
        return self.tokens[self.idx + 1]

    def get_result(self):
        return self.result
    
    def is_class(self):
        return self.token.value == 'class'
    
    def remember_class(self):
        self.known_user_types[self.token.value] = True

    def is_known_type(self):
        return self.token.value in self.known_user_types
    
    def is_floatable(self):
        try:
            float(self.token.value)
            return True
        except ValueError:
            return False

    def is_intable(self):
        try:
            int(self.token.value)
            return True
        except ValueError:
            return False

    def is_compare(self):
        return self.peel_next() == "="
    
    def parse_bracket(self):
        if self.peel_next().value != "]":
            self.result.append( Token(TokenType.Syntax, self.token.value) )
            return
        t = self.result.pop(-1)
        self.next()
        self.result.append( Token(TokenType.ReferenceType, t.value + "[]") )

    def parse_library(self):
        self.result.append( Token(TokenType.Keyword, self.token.value) )
        s = ""
        while self.next().value != ";":
            s += self.token.value
        self.result.append( Token(TokenType.Library, s) )
        self.result.append( Token(TokenType.Syntax,  ";") )

    def parse(self):
        self.reset()
        while self.next():
            if self.is_class():
                self.next()
                self.remember_class()

        self.reset()
        while self.next():
            if   self.token.value == "[":
                self.parse_bracket()
            elif self.is_known_type():
                self.result.append( Token(TokenType.ReferenceType, self.token.value) )
            elif self.is_floatable():
                self.result.append( Token(TokenType.Literal, float(self.token.value)) )
            elif self.is_intable():
                self.result.append( Token(TokenType.Literal, int(self.token.value)) )
            elif self.token.value == "import":
                self.parse_library()
            else:
                self.result.append(self.token)
