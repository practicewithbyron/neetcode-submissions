class Solution:

    def encode(self, strs: List[str]) -> str:
        # Add csv delimeter
        if len(strs) is 0:
            return "[empty]"
        return '✅'.join(strs)

    def decode(self, s: str) -> List[str]:
        if s == "":
            return [""]
        elif s == "[empty]":
            return []
        return s.split('✅') if len(list(s)) > 0 else []
