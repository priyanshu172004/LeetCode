class Solution {
    static void findAllSubsetsWithoutDuplicates(int[] arr, ArrayList<Integer> ans, int i, List<List<Integer>> allSubsets){
        if(i == arr.length){
            allSubsets.add(new ArrayList<Integer>(ans));
            return;
        }
        ans.add(arr[i]);
        findAllSubsetsWithoutDuplicates(arr, ans, i + 1, allSubsets);
        ans.remove(ans.size() - 1);
        int idx = i + 1;
        while(idx < arr.length && arr[idx] == arr[idx - 1]){
            idx++;
        }
        findAllSubsetsWithoutDuplicates(arr, ans, idx, allSubsets);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> allSubsets = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        findAllSubsetsWithoutDuplicates(nums, ans, 0, allSubsets);
        return allSubsets;
    }
}