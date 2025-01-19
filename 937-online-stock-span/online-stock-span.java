class StockSpanner {

    private Stack<int[]> stack; // Stack to store price and its span

    public StockSpanner() {
        this.stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1; // Span of the current price

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1]; // Add the span of the top price to the current span
        }

        stack.push(new int[]{price, span}); // Push the current price and its span onto the stack
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */