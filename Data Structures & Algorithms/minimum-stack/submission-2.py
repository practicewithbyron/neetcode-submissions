class MinStack:

    def __init__(self):
        self.stack = None
        self.smallest_stack = None

    def push(self, val: int) -> None:
        if self.smallest_stack:
            if val < self.smallest_stack[-1]:
                self.smallest_stack.append(val)
            else:
                self.smallest_stack.append(self.smallest_stack[-1])
            self.stack.append(val)
        else:
            self.stack = [val]
            self.smallest_stack = [val]
  

    def pop(self) -> None:
        self.stack.pop(-1)
        self.smallest_stack.pop(-1)

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.smallest_stack[-1]

        
