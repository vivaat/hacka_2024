from argparse  import ArgumentParser
from tokenizer import PreParser, Parser
from readfiles import get_example_files

parser = ArgumentParser(
                    prog='test_tokenizer.py',
                    description='Reads Java files and tokenizes it.',
)

parser.add_argument("--file", dest="file",
                    help="Java file to tokenize.", metavar="file")

args      = parser.parse_args()
file_path = args.file




for file_path in get_example_files():
    print()
    print("FILE NAME IS ", file_path)
    with PreParser(file_path) as preparser:
        preparser.parse()
        with Parser( preparser.get_result() ) as parser:
            parser.parse()
            for value in parser.get_result():
                print(value)
