class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        start_index = 0
        end_index = 0
        char_count = {chr(c): 0 for c in range(ord('A'), ord('Z') + 1)}
        max_length = 0
        while end_index < len(s):
            char_count[s[end_index]] = char_count[s[end_index]] + 1
            if end_index - start_index - char_count[self.mostCommonChar(char_count)] + 1 > k:
                char_count[s[start_index]] -= 1
                start_index += 1
            else:
                # Looking good, make the window bigger
                if end_index - start_index > max_length:
                    max_length = end_index - start_index
            end_index += 1
                
        return max_length + 1
    
    def mostCommonChar(self, hashmap):
        cur_max = 0
        common_char = 'A'
        for key in hashmap.keys():
            if hashmap[key] > cur_max:
                print(common_char)

                cur_max = hashmap[key]
                common_char = key
        return common_char

            