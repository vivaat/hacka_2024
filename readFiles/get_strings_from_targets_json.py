import json


def get_strings_from_targets_json(json_path: str) -> list[str]:
    """ Читает .json файл с частями кода для обработки нейросетью
    :return: Список строк для определения качества срабатывания
    """

    with open(json_path, "r", encoding="utf-8") as f:
        settings = json.loads(f.read())

    with open(settings["file"], 'r', encoding='utf-8') as code:
        content = code.readlines()
        output = []

        for target in settings["locations"]:
            if target["start"] != target["end"]:
                output.append(
                    '\n'.join(content[target["start"]:target["end"] + 1])
                )
            else:
                output.append(content[target["start"] - 1])

        return output
