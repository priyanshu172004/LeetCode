class Solution {
    public int largestAltitude(int[] gain) {
        int maxGain = 0;
        int preffixSum = 0;
        for(int i = 0; i < gain.length; i++){
            preffixSum += gain[i];
            maxGain = Math.max(preffixSum, maxGain);
        }
        return maxGain;
    }
}