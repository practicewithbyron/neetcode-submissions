class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        # Monotonic stack
        result = [0] * len(temperatures)
        stack = []

        for i in range(len(temperatures)):
            while stack and temperatures[i] > temperatures[stack[-1]]:
                res = stack.pop()
                result[res] = i - res
            stack.append(i)
        
        return result



            

