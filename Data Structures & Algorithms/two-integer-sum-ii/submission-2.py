class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        # Keep moving the second pointer, find the largest number lower than the target, if the largest plus the smallest is too big, then decrease the point_2, if its too small, then increase point_1
        solved = False
        point_1 = 0
        point_2 = len(numbers) - 1
        while point_2 > point_1:
            if numbers[point_1] + numbers[point_2] == target:
                return [point_1 + 1, point_2 + 1]

            if numbers[point_1] + numbers[point_2] > target:
                point_2 -= 1
            elif numbers[point_1] + numbers[point_2] < target:
                point_1 += 1

