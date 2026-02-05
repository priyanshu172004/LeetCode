class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = 0;
        }
        for(int i = 0; i < nums.length; i++){
            int step = nums[i];
            if(step < 0){
                int prevIndex = ((i + step) % n + n) % n;
                result[i] = nums[prevIndex];

            }else if(step > 0){
                int nextIndex = (i + step) % n;
                result[i] = nums[nextIndex];
            }else{
                result[i] = nums[i];
            }
        }
        return result;
    }
}