class Solution {
    public int totalMoney(int n) {
        int start = 0;
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(count == 7){
                start = i/7 + 1;
                count = 0;
            }else{
                start++;
            }
            sum += start;
            count++;
        }
        return sum;
    }
}