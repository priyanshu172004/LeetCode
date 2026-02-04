class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                stack.push(String.valueOf(ch));
            }else{
                StringBuilder substring = new StringBuilder();
                while(!stack.peek().equals("[")){
                    substring.insert(0, stack.pop());
                }
                stack.pop();

                StringBuilder digit = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                    digit.insert(0, stack.pop());
                }

                StringBuilder result = new StringBuilder();
                int k = Integer.parseInt(digit.toString());
                for(int i = 0; i < k; i++){
                    result.append(substring);
                }

                stack.push(result.toString());
            }
        }
        StringBuilder finalString = new StringBuilder();
        for(String str : stack){
            finalString.append(str);
        }
        return finalString.toString();
    }
}