class StockSpanner {
    Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    public int next(int price) {
        int idx = 1;
        while(!stack.isEmpty() && price >= stack.peek()[0]){
            idx += stack.peek()[1];
            stack.pop();
        }
        stack.push(new int[]{price, idx});
        return idx;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */