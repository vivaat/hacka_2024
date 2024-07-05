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

    dir_path = Path(os.path.dirname(os.path.realpath(__file__))).parent.absolute()
    p = os.path.join(dir_path, "KeycloakExamples", "Main.java")
    settings['file'] = str(p)

    with open(settings["file"], 'r', encoding='utf-8') as code:
        content = code.readlines()
        output = []
        for location in settings['locations']:
            for target in location:
                if target["start"] != target["end"]:
                    output.append(
                        '\n'.join(content[target["start"]:target["end"] + 1])
                    )
                else:
                    output.append(content[target["start"] - 1])

        return output
