from os          import listdir
from os.path     import isfile, join
from dataclasses import dataclass
from tempfile    import NamedTemporaryFile


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

 

import os
from pathlib import Path


def get_strings_from_targets_json() -> list[str]:
    """ Читает .json файл с частями кода для обработки нейросетью
    :return: Список строк для определения качества срабатывания
    """

    settings = {
        "locations": [
            [
                {
                    "start": 52,
                    "end": 52
                },
                {
                    "start": 114,
                    "end": 126
                }
            ],
            [
                {
                    "start": 74,
                    "end": 74
                },
                {
                    "start": 92,
                    "end": 104
                }
            ]
        ],
        "parent": {"start": 36, "end": 136}
    }

    dir_path = Path(os.path.dirname(os.path.realpath(__file__))).absolute()
    p = os.path.join(dir_path, "KeycloakExamples", "Main.java")
    settings['file'] = str(p)

    with open(settings["file"], 'r', encoding='utf-8') as code:
        content = code.readlines()
        output = []
        for location in settings['locations']:
            el = []
            for target in location:
                if target["start"] != target["end"]:
                    el.append(
                        '\n'.join(content[target["start"]:target["end"] + 1])
                    )
                else:
                    el.append(content[target["start"] - 1])
            output.append(el)

        return output
    
def get_example_files():
    filenames = []
    for el in get_strings_from_targets_json():
        tmp = NamedTemporaryFile(mode='w', delete=False)     
        for line in el:
            tmp.write(line)
        filenames.append(tmp.name)
        tmp.close()
    return filenames
