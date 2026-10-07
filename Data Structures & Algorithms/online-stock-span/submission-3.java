class StockSpanner {
    private Deque<Integer> stack = new ArrayDeque<>(); 
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int count = 1;

        // Keep a record of the stack
        Deque<Integer> temp = new ArrayDeque<Integer>(stack);
        // How many in the stack are less than or equal to this value?
        while (!stack.isEmpty() && stack.peek() <= price)
        {
            count += 1;
            stack.pop();
        }
        // Restore the stack?
        stack = temp;
        stack.push(price);

        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */