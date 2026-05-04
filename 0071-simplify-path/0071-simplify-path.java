class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String comp : str){
            if(comp.equals(".") || comp.equals("")){
                continue;
            }
            if(comp.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(comp);
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.insert(0, "/" + stack.pop());
        }
        return result.length() == 0 ? "/" : result.toString();
    }
}