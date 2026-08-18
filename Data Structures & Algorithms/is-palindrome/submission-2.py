class Solution:
    def isPalindrome(self, s: str) -> bool:
        index_1 = 0
        index_2 = len(s) - 1
        result = True
        # Move points at the same time
        print(s)

        while index_1 < index_2:
            # Keep moving the individual pointers so they skip over non alnum values
            while index_1 < index_2 and not s[index_1].isalnum():
                index_1 += 1
            while index_2 > index_1 and not s[index_2].isalnum():
                index_2 -= 1
            if s[index_1].lower() != s[index_2].lower():
                result = False
                break

            index_1 += 1
            index_2 -= 1
        
        return result
            

