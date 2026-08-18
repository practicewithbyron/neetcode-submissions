class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        _set = set()
        for num in nums:
            _set.add(num)
        
        return len(_set) != len(nums)

        