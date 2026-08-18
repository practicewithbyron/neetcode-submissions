from collections import Counter

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        s_map = Counter()
        t_map = Counter()
        for i in range(len(s)):
            s_map[s[i]] += 1
            t_map[t[i]] += 1
        
        for key in s_map:
            if s_map[key] != t_map[key]:
                return False

        return True

