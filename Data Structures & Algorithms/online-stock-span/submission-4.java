class StockSpanner {
    // Price, Span
    private Deque<List<Integer>> stack = new ArrayDeque<>(); 
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int prevSpan = 0;

        System.out.println(price);


        // How many in the stack are less than or equal to this value?
        while (!stack.isEmpty() && stack.peek().get(0) <= price)
        {
            prevSpan += stack.peek().get(1);
            stack.pop();
        }

    
        System.out.println(prevSpan);

        // Restore the stack?
        stack.push(List.of(price, prevSpan + 1));

        System.out.println(stack);


        return prevSpan + 1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */