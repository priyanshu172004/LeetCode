class Solution {
    Set<List<Integer>> set = new HashSet<>();
    public void findAllCombinations(int[] candidates, int idx, List<Integer> combinations, int target){
        if(idx == candidates.length || target < 0){
            return;
        }
        if(target == 0){
            set.add(new ArrayList<>(combinations));
            return;
        }
        combinations.add(candidates[idx]);
        findAllCombinations(candidates, idx + 1, combinations, target - candidates[idx]);
        findAllCombinations(candidates, idx, combinations, target - candidates[idx]);
        combinations.remove(combinations.size() - 1);
        findAllCombinations(candidates, idx + 1, combinations, target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combinations = new ArrayList<>();
        findAllCombinations(candidates, 0, combinations, target);
        return new ArrayList<>(set);
    }
}