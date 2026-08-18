class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        con_product_forward = []
        con_product_backwards = []
        for i in range(len(nums)):
            if i == 0:
                con_product_forward.append(nums[i])
            else:
                con_product_forward.append(nums[i] * con_product_forward[i-1])

        arr_index = 0
        for i in range(len(nums) - 1, -1, -1):
            if i == len(nums) - 1:
                con_product_backwards.append(nums[i])
            else:
                con_product_backwards.append(nums[i] * con_product_backwards[arr_index])
                arr_index += 1

        con_product_backwards.reverse()  # now aligned with nums order
        
        print(con_product_forward)
        print(con_product_backwards)
        result = []
        # Use the left and right element of each given index to find the product of the numbers to the left and to the right of that number
        # The product of those will then be the product of everything except that element
        for i in range(len(nums)):
            left = con_product_forward[i-1] if i > 0 else 1
            right = con_product_backwards[i+1] if i < len(nums) - 1 else 1
            result.append(left * right)

        return result