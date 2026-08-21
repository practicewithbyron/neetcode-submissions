class Solution:
    def findMin(self, nums: List[int]) -> int:
        # O(n) is traversing through the array and finding when the smallest value appears
        # Binary search
        # Find when the array is no longer continous, thats the start / end point
      
        window_start = 0
        window_end = len(nums) -1

        smallest_val = 1001
        while window_start <= window_end:
            middle = (window_start + window_end) // 2
            if nums[middle] < smallest_val:
                smallest_val = nums[middle]
            # If middle < right 
            print(nums[middle])
            if nums[middle] < nums[window_end]:
                # We're in a valid ascending part
                # Go left
                window_end = middle - 1
            else:
                window_start = middle + 1
        
        return smallest_val
        


