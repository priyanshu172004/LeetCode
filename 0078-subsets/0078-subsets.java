class Solution {
    public void findSubsets(int[] nums, ArrayList<Integer> ans, int i, List<List<Integer>> finalSet){
        if(i == nums.length){
            finalSet.add(new ArrayList<Integer>(ans));
            return;
        }
        ans.add(nums[i]);
        findSubsets(nums, ans, i + 1, finalSet);
        ans.remove(ans.size() - 1);
        findSubsets(nums, ans, i + 1, finalSet);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalSet = new ArrayList<>();
        findSubsets(nums, new ArrayList<Integer>(), 0, finalSet);
        return finalSet;
    } 
}