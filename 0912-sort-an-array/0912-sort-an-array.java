class Solution {
    public void merge(int[] nums, int left, int right){
        int mid = (left + right) / 2;
        if(left >= right){
            return;
        }
        merge(nums, left, mid);
        merge(nums, mid + 1, right);
        mergeSort(nums, left, mid, right);
    }
    public void mergeSort(int[] nums, int left, int mid, int right){
        int i = left;
        int j = mid + 1;
        List<Integer> temp = new ArrayList<>();
        while(i <= mid && j <= right){
            if(nums[i] <= nums[j]){
                    temp.add(nums[i]);
                    i++;
            }else{
                temp.add(nums[j]);
                j++;
            }
        }
        while(i <= mid){
            temp.add(nums[i]);
            i++;
        }
        while(j <= right){
            temp.add(nums[j]);
            j++;
        }

        for(int k = 0; k < temp.size(); k++){
            nums[left + k] = temp.get(k);
        }
    }
    public int[] sortArray(int[] nums) {
        merge(nums, 0, nums.length - 1);
        return nums;
    }
}