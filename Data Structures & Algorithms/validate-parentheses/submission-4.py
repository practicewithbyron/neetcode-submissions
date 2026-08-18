class Solution:
    def isValid(self, s: str) -> bool:
        bracket_map = {']': '[', '}': '{', ')': '('}
        stack = []
        result = True
        if len(s) == 1:
            return False

        for c in s:
            # Is it an opening bracket?
            if c not in bracket_map.keys():
                stack.append(c)
            else:
                # Closing bracket
                # Is it the correct closing bracket?
                # If the stack is empty that means there are no opening brackets before, so invalid
                if len(stack) == 0 or bracket_map[c] != stack[-1]:
                    result = False
                    break
                else:
                    stack.pop(-1)
        
        if len(stack) != 0:
            result = False

        return result

