class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n <= 1) return 0;

        int jumps = 0;
        int currEnd = 0;
        int farthestEnd = 0;
        for(int i = 0; i < n - 1; i++){
            farthestEnd = Math.max(farthestEnd, i + nums[i]);
            if(i == currEnd){
                jumps++;
                currEnd = farthestEnd;
            }
        }
        return jumps;
    }
}