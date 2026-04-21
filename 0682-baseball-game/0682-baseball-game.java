class Solution {
    public int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();
        for(int i = operations.length - 1; i >= 0; i--){
            stack.push(operations[i]);
        }
        List<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            if(stack.peek().equals("C")){
                stack.pop();
                list.remove(list.size() - 1);
            }else if(stack.peek().equals("D")){
                stack.pop();
                list.add(list.get(list.size() - 1) * 2);
            }else if(stack.peek().equals("+")){
                stack.pop();
                list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
            }else{
                list.add(Integer.valueOf(stack.pop()));
            }
        }
        int sum = 0;
        for(int i : list){
            sum += i;
        }
        return sum;
    }
}