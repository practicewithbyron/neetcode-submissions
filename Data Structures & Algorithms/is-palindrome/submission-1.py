class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = ''.join(char for char in s if char.isalnum()).lower()
        index_1 = 0
        index_2 = len(s) - 1
        result = True
        # Move points at the same time
        print(s)

        while index_1 < index_2:
            print(f"index_1 {index_1}")
            print(f"index_2 {index_2}") 
            if s[index_1] != s[index_2]:
                print(f"{s[index_1]} at {index_1} does not equal {s[index_2]} at {index_2}")
                result = False
                break
            index_1 += 1
            index_2 -= 1
        
        return result
            

