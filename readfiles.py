from os          import listdir
from os.path     import isfile, join
from dataclasses import dataclass


@dataclass
class File:
    name: str
    path: str
    lines: list
    label: int
    
    
def readfile(filename):
    with open(filename) as file:
        lines = [line.rstrip() for line in file]
    return lines


def readdir(dirname):
    files = [f for f in listdir(dirname) if isfile(join(dirname, f))]
    return files


def fileFactory(filename, directory, label):
    fullpath = join(directory, filename)
    return File(filename, fullpath, readfile(fullpath), label)
