class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> array = new ArrayList<>();
        for(int i : nums){
            array.add(i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        findPermutations(array, 0, ans);
        return ans;
    }
    public List<List<Integer>> findPermutations(List<Integer> array, int idx, List<List<Integer>> ans){
        if(idx == array.size()){
            ans.add(new ArrayList<>(array));
            return ans;
        }
        for(int i = idx; i < array.size(); i++){
            Collections.swap(array, idx, i);
            findPermutations(array, idx + 1, ans);
            Collections.swap(array, idx, i);
        }
        return ans;
    }
}