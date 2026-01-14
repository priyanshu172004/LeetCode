class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a : asteroids){
            if(a > 0){
                stack.push(a);
            }else{
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(a);
                }
                if(stack.peek() == -a){
                    stack.pop();
                }
            }
        }
        int[] result = new int[stack.size()];
        int size = stack.size() - 1;
        while(!stack.isEmpty()){
            result[size] = stack.pop();
            size--;
        }
        return result;
    }
}