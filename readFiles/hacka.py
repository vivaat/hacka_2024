
from readfiles import readdir, fileFactory
from enum import IntEnum
from argparse import ArgumentParser


class labels(IntEnum):
    truePositive  = 0
    falsePositive = 1
  
    
parser = ArgumentParser(
                    prog='hacka.py',
                    description='Reads files in FP and TP directories',
 )

parser.add_argument("--tp", dest="tp_dir",
                    help="Directory with true positives", metavar="tp_dir")
parser.add_argument("--fp", dest="fp_dir",
                    help="Directory with false positives", metavar="fp_dir")

args = parser.parse_args()
print(args.tp_dir)


tp_dir = args.tp_dir
fp_dir = args.fp_dir

tp_file_names = readdir(tp_dir)
fp_file_names = readdir(fp_dir)

print(tp_file_names)
print(fp_file_names)

tp_files = list()
fp_files = list()

for f in tp_file_names:   
    tp_files.append( fileFactory(f, tp_dir, labels.truePositive) )
   
for f in fp_file_names:   
    fp_files.append( fileFactory(f, fp_dir, labels.falsePositive) )
    

print(tp_files[0].name)
print(tp_files[0].path)
print(tp_files[0].label)

for line in tp_files[0].lines:
    print(line)
    