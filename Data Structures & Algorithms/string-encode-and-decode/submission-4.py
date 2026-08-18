class Solution:

    def encode(self, strs: List[str]) -> str:
        result = ""
        for _str in strs:
            result += f"{len(_str)}#{_str}"
        return result

    def decode(self, s: str) -> List[str]:
        result = []
        index = 0
        while index < len(s):
            # read digits until we hit '#'
            j = index
            while s[j] != "#":
                j += 1
            length = int(s[index:j])
            start = j + 1
            end = start + length
            result.append(s[start:end])

            index = end
        return result