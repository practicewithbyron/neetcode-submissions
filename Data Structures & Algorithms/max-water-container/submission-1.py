class Solution:
    def maxArea(self, heights: List[int]) -> int:
        # Find the first largest element, that will provide the largest base to work from
        # The largest will have to be 1 higher than the previous to provide a better result
        pointer_1 = 0
        pointer_2 = len(heights) - 1

        largest_vol = 0
        while pointer_1 < pointer_2:
            cur = min(heights[pointer_1], heights[pointer_2]) * (pointer_2 - pointer_1)
            prev_pointer_1 = pointer_1
            if cur > largest_vol:
                largest_vol = cur
            elif heights[pointer_2] > heights[pointer_1]:
                pointer_1 += 1
            elif heights[pointer_1] > heights[pointer_2]:
                pointer_2 -= 1
            else:
                pointer_1 +=1
                pointer_2 -=1

        return largest_vol
                 

                



