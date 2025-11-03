class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        int max = 0;
        
        for (int i = 0; i < colors.length(); i++) {
            if (i == 0 || colors.charAt(i) != colors.charAt(i - 1)) {
                max = neededTime[i];
            } else {
                if (neededTime[i] > max) {
                    time += max; 
                    max = neededTime[i]; 
                } else {
                    time += neededTime[i]; 
                }
            }
        }
        return time;
    }
}