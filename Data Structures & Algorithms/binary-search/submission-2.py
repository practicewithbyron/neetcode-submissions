class Solution:
    def search(self, nums: List[int], target: int) -> int:
        start_window = 0
        end_window = len(nums) - 1
        while start_window <= end_window:
            middle = (start_window + end_window) // 2
            if nums[middle] == target:
                return middle
            elif nums[middle] > target:
                end_window = middle - 1
            else:
                start_window = middle + 1
        return -1