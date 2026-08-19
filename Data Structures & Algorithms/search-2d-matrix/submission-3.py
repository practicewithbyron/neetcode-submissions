class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # Binary search
        # Middle array
        # Find row by comparing first and last values
        # Traverse rows
        # Get middle row
        # Is target more than the first value and less than last value
        # - Must be in that row
        # Is target less than first value,
        # - Must be in a row before that row
        # Is target higher than last value,
        # - Must be in a row later than that row
        # Find next middle which is the row index of middle of current window

        if len(matrix) == 1:
            present = False
            for num in matrix[0]:
                if num == target:
                    present = True
            return present
        
        
        # if len(matrix) == 2:
        #     present = False
        #     for num in matrix[0]:
        #         if num == target:
        #             present = True
        #     for num in matrix[1]:
        #         if num == target:
        #             present = True
        #     return present

        start_window = 0
        end_window = len(matrix) - 1
        break_index = 0
        while start_window <= end_window:
            middle = (end_window + start_window) // 2
            print(f"middle {middle}")
            print(f"start {start_window}")
            print(f"end {end_window}")
            if target >= matrix[middle][0] and target <= matrix[middle][-1]:
                # In this row, yay
                present = False
                print(f"reached {matrix[middle]}")
                for val in matrix[middle]:
                    print(val)
                    if val == target:
                        present = True
                return present
            elif target < matrix[middle][0]:
                # Row before
                end_window = middle - 1
            elif target > matrix[middle][-1]:
                # Row after
                start_window = middle + 1
            if break_index == 10:
                break
            break_index += 1
        
        return False
            



        