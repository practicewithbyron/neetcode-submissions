class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        window_start = 0
        window_end = 0

        uniques = {}
        max_length = 0
        while window_end < len(s):

            if not s[window_end] in uniques.keys():
                uniques[s[window_end]] = window_end
                window_end += 1
            else:
                window_start = max(window_start, uniques[s[window_end]] + 1)
                uniques[s[window_end]] = window_end
                window_end += 1

            
            if window_end - window_start > max_length:
                max_length = window_end - window_start
            
        return max_length
            





