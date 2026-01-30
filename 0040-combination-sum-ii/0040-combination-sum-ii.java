class Solution {
    public void findCombs(int[] arr, int idx, List<Integer> comb, List<List<Integer>> result, int target){
        int n = arr.length;
        if(target == 0){
            result.add(new ArrayList<>(comb));
            return;
        }
        for(int i = idx; i < n; i++){
            if(i > idx && arr[i] == arr[i - 1]){
                continue;
            }
            if(arr[i] > target){
                break;
            }
            comb.add(arr[i]);
            findCombs(arr, i + 1, comb, result, target - arr[i]);
            comb.remove(comb.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> comb = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombs(candidates, 0, comb, result, target);
        return result;
    }
}