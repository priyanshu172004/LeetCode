class Solution {
    public int binaryGap(int n) {
        int currDist = -1;
        int maxDist = 0;
        while(n > 0){
            int mod = n % 2;
            if(mod == 1){
                if(currDist != -1){
                    maxDist = Math.max(maxDist, currDist);
                }
                currDist = 1;
            }else if(currDist != -1){
                currDist++;
            }
            n /= 2;
        }
        return maxDist;
    }
}