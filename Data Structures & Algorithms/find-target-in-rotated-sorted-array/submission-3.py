class Solution:
    def search(self, nums: List[int], target: int) -> int:
        window_start = 0
        window_end = len(nums) - 1

        if len(nums) == 1:
            if target != nums[0]:
                return -1
            else:
                return 0

        while window_start <= window_end:
            middle = (window_start + window_end) // 2

            if nums[middle] == target:
                return middle

            if nums[window_start] <= nums[middle]:
                if nums[window_start] <= target < nums[middle]:
                    window_end = middle - 1
                else:
                    window_start = middle + 1
            else:
                if nums[middle] < target <= nums[window_end]:
                    window_start = middle + 1
                else:
                    window_end = middle - 1



        
        return -1
