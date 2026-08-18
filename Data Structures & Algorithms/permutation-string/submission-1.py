class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        char_map = {}
        char_count = {}

        for c in s1:
            char_map[c] = char_map.get(c, 0) + 1
            if c not in char_count.keys():
                char_count[c] = 0

        # Sliding window
        # Move S1's characters through an S2 window
        window_start = 0
        window_end = len(s1) - 1

        # Calc inital window
        for i in range(window_start, window_end + 1):
            print(i)
            if s2[i] in char_map.keys():
                char_count[s2[i]] = char_count[s2[i]] + 1


        if char_count == char_map: # ?
            return True
        print(char_map)
        print(char_count)
        while window_end + 1 < len(s2):

            if s2[window_start] in char_count.keys():
                char_count[s2[window_start]] = char_count[s2[window_start]] - 1
            if s2[window_end + 1] in char_count.keys():
                char_count[s2[window_end + 1]] = char_count[s2[window_end + 1]] + 1

            if char_count == char_map: # ?
                return True
            window_start += 1
            window_end += 1

        return False





