class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0){
            return;
        }
        if(nums.length == 1){
            return;
        }
        
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];
        int start = 0;
        for(int i = n - k; i < n; i++){
            temp[start++] = nums[i];
        }
        for(int j = 0; j < n - k; j++){
            temp[start++] = nums[j];
        }
        int z = 0;
        for(int i = 0; i < temp.length; i++){
            nums[z++] = temp[i];
        }
    }
}