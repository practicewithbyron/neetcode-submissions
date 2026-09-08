// class Solution:
//     def twoSum(self, nums: List[int], target: int) -> List[int]:
//         # Store the value, and the other value needed to be valid
//         val_map = {}
//         for i in range(len(nums)):
//             # Try and see if this value is a target
//             if nums[i] in val_map.keys():
//                 return [val_map[nums[i]], i]
//             # Add val and target
//             val_map[target - nums[i]] = i


            


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> val_map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            if (val_map.keySet().contains(nums[i]))
            {
                return new int[]{val_map.get(nums[i]), i};
            }

            val_map.put(target - nums[i], i);
        }

        return new int[]{};
    }
}
