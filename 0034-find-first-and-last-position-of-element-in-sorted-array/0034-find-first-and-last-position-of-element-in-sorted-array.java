class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findSecond(nums, target);
        return result;
    }
    public static int findFirst(int[] nums, int tar){
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == tar){
                ans = mid;
                right = mid - 1;
            }else if(nums[mid] <= tar){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int findSecond(int[] nums, int tar){
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == tar){
                ans = mid;
                left = mid + 1;
            }else if(nums[mid] <= tar){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}