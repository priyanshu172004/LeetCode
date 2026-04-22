class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums){
            if(num > 0) set.add(num);
        }
        int num = 1;
        while(num <= nums.length + 1){
            if(!set.contains(num)){
                return num;
            }
            num++;
        }
        return -1;
    }
}