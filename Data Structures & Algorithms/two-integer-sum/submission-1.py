class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Store the value, and the other value needed to be valid
        val_map = {}
        for i in range(len(nums)):
            # Add val and target

            # Try and see if this value is a target
            if nums[i] in val_map.keys():
                return [val_map[nums[i]], i]
            val_map[target - nums[i]] = i


            
