class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int position = 0;
        int choice1 = 0;
        int choice2 = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'L'){
                position--;
            }else if(ch == 'R'){
                position++;
            }else{
                choice1++;
                choice2--;
            }
        }
        int ans = Math.max(Math.abs(position + choice1), Math.abs(position + choice2));
        return ans;
    }
}