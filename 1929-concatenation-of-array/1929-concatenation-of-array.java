class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        int t = 0;
        for(int i = 0; i < n; i++){
            ans[t++] = nums[i];
        }
        while(t < ans.length){
            for(int i : nums){
                ans[t++] = i;
            }
        }
        return ans;
    }
}