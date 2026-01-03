class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if(arr.length <= 1){
            return true;
        }
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int count : map.values()){
            if(set.contains(count)){
                return false;
            }
            set.add(count);
        }
        return true;
    }
}