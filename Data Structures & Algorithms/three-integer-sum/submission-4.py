class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums = sorted(nums)
        point_1 = 0
        while point_1 < len(nums) - 2:
            if point_1 > 0 and nums[point_1] == nums[point_1 - 1]:
                point_1 += 1
                continue
            point_2 = point_1 + 1
            point_3 = len(nums) - 1
            while point_2 < point_3:
                if nums[point_1] * -1 == nums[point_2] + nums[point_3]:
                    result.append([nums[point_1], nums[point_2], nums[point_3]])
                    point_2 += 1
                    point_3 -= 1
                    while point_2 < point_3 and nums[point_2] == nums[point_2 - 1]:
                        point_2 += 1
                    while point_2 < point_3 and nums[point_3] == nums[point_3 + 1]:
                        point_3 -= 1
                elif nums[point_1] * -1 > nums[point_2] + nums[point_3]:
                    point_2 += 1
                else:
                    point_3 -= 1

            point_1 += 1

        return result