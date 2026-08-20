import math

class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        # Sort then binary?
        # [1, 2, 3, 4]
        window_start = 1
        window_end = max(piles)
        while window_start < window_end:
            middle = (window_end + window_start) // 2
            # Work it out using middle
            time_taken = 0
            for pile in piles:
                if pile % middle == 0:
                    time_taken += pile // middle
                else:
                    time_taken += (pile // middle) + 1

            if time_taken > h:
                # Too big must be a larger number
                window_start = middle + 1
            else:
                window_end = middle
        
        return window_start

