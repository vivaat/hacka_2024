from argparse  import ArgumentParser
from tokenizer import PreParser, Parser


parser = ArgumentParser(
                    prog='test_tokenizer.py',
                    description='Reads Java files and tokenizes it.',
)

parser.add_argument("--file", dest="file",
                    help="Java file to tokenize.", metavar="file")

args      = parser.parse_args()
file_path = args.file


with PreParser(file_path) as preparser:
    preparser.parse()
    with Parser( preparser.get_result() ) as parser:
        parser.parse()
        for value in parser.get_result():
            print(value)
