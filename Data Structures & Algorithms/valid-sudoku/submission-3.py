class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # Top Row
        top_left = set()
        top_left_insertion_count = 0
        top_middle = set()
        top_middle_insertion_count = 0
        top_right = set()
        top_right_insertion_count = 0

        # Middle
        middle_left = set()
        middle_left_insertion_count = 0
        middle_middle = set()
        middle_middle_insertion_count = 0
        middle_right = set()
        middle_right_insertion_count = 0

        # Bottom
        bottom_left = set()
        bottom_left_insertion_count = 0
        bottom_middle = set()
        bottom_middle_insertion_count = 0
        bottom_right = set()
        bottom_right_insertion_count = 0

        # Columns
        columns = columns = [{"set": set(), "insertion_count": 0} for _ in range(9)]

        for row_i in range(len(board)):
            row_set = set()
            row_insertion_count = 0
            for col_i in range(len(board[row_i])):
                if board[row_i][col_i] != ".":
                    row_set.add(board[row_i][col_i])
                    row_insertion_count += 1

                    columns[col_i]["set"].add(board[row_i][col_i])
                    columns[col_i]["insertion_count"] += 1

                    if row_i <= 2:
                        if col_i <= 2:
                            top_left.add(board[row_i][col_i])
                            top_left_insertion_count += 1 
                        elif col_i <= 5:
                            top_middle.add(board[row_i][col_i])
                            top_middle_insertion_count += 1 
                        else:
                            top_right.add(board[row_i][col_i])
                            top_right_insertion_count += 1 
                    elif row_i <= 5:
                        if col_i <= 2:
                            middle_left.add(board[row_i][col_i])
                            middle_left_insertion_count += 1 
                        elif col_i <= 5:
                            middle_middle.add(board[row_i][col_i])
                            middle_middle_insertion_count += 1 
                        else:
                            middle_right.add(board[row_i][col_i])
                            middle_right_insertion_count += 1 
                    else:
                        if col_i <= 2:
                            bottom_left.add(board[row_i][col_i])
                            bottom_left_insertion_count += 1 
                        elif col_i <= 5:
                            bottom_middle.add(board[row_i][col_i])
                            bottom_middle_insertion_count += 1 
                        else:
                            bottom_right.add(board[row_i][col_i])
                            bottom_right_insertion_count += 1 
            if len(row_set) != row_insertion_count:
                return False
        
        if len(top_left) != top_left_insertion_count or len(top_middle) != top_middle_insertion_count or len(top_right) != top_right_insertion_count:
            return False

        if len(middle_left) != middle_left_insertion_count or len(middle_middle) != middle_middle_insertion_count or len(middle_right) != middle_right_insertion_count:
            return False

        if len(bottom_left) != bottom_left_insertion_count or len(bottom_middle) != bottom_middle_insertion_count or len(bottom_right) != bottom_right_insertion_count:
            return False

        for col in columns:
            if len(col["set"]) != col["insertion_count"]:
                return False

        return True







