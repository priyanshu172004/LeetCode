class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map1 = new HashMap<>();
        HashMap<Integer, Boolean> map2 = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        for (int num : nums1) {
            map1.put(num, true);
        }
        for (int num : nums2) {
            map2.put(num, true);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(Integer key : map1.keySet()){
            if(!map2.containsKey(key)){
                list1.add(key);
            }
        }
        for(Integer key : map2.keySet()){
            if(!map1.containsKey(key)){
                list2.add(key);
            }
        }
        result.add(list1);
        result.add(list2);

        return result;
    }
}