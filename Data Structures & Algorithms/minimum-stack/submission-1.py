class MinStack:

    def __init__(self):
        self.stack = []
        self.smallest_stack = []

    def push(self, val: int) -> None:
        if type(val) == str:
            val = null

        try:
            self.stack.append(val)
            if val < self.smallest_stack[-1]:
                self.smallest_stack.append(val)
            else:
                self.smallest_stack.append(self.smallest_stack[-1])

        except Exception:
            self.stack.append(val)
            self.smallest_stack.append(val)
            return
  

    def pop(self) -> None:
        self.stack.pop(-1)
        self.smallest_stack.pop(-1)

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.smallest_stack[-1]

        
