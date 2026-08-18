class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0

        sorted_nums = sorted(set(nums))
        print(sorted_nums)
        count = 1
        counts = []
        for i in range(len(sorted_nums)):
            if i > 0:
                if sorted_nums[i] - 1 == sorted_nums[i - 1]:
                    count += 1
                else:
                    counts.append(count)
                    count = 1

        counts.append(count)
        return sorted(counts)[-1]

