class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        operators = ["+", "*", "/", "-"]

        if len(tokens) == 1:
            return int(tokens[0])

        index = 0
        while index < len(tokens):
            if tokens[index] in operators:
                num_1 = stack.pop(-1)
                num_2 = stack.pop(-1)

                result = self.applyOperator(tokens[index], [num_2, num_1])
                stack.append(result)
            else:
                stack.append(tokens[index])
            index += 1
        
        return stack[0]

    def applyOperator(self, operator, numbers):
        if operator == "+":
            result = int(numbers[0])
            for i in range(1, len(numbers)):
                result += int(numbers[i])
            return result
        elif operator == "-":
            result = int(numbers[0])
            for i in range(1, len(numbers)):
                result -= int(numbers[i])
            return result
        elif operator == "*":
            result = int(numbers[0])
            for i in range(1, len(numbers)):
                result *= int(numbers[i])
            return result
        elif operator == "/":
            result = int(numbers[0])
            for i in range(1, len(numbers)):
                result /= int(numbers[i])
            return int(result)
