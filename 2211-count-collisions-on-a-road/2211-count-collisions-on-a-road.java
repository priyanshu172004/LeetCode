class Solution {
    public int countCollisions(String directions) {
        Stack<Character> st = new Stack<>();
        int n = directions.length();
        st.push(directions.charAt(0));
        int collisions = 0;

        for(int i = 1; i < n; i++){
            char curr = directions.charAt(i);

            if(st.peek() == 'R' && curr == 'L'){
                collisions += 2;
                st.pop();
                curr = 'S';
            }else if(st.peek() == 'S' && curr == 'L'){
                collisions++;
                curr = 'S';
            }
            while(!st.isEmpty() && (st.peek() == 'R' && curr == 'S')){
                collisions++;
                st.pop();
            }
            st.push(curr);
        }
        return collisions;
    }
}