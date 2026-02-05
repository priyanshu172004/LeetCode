class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            int step = nums[i];
            int idx = ((i + step) % n + n) % n;
            result[i] = nums[idx];
        }
        return result;
    }
}