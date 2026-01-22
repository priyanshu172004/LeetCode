class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] characters = s.toCharArray();
            Arrays.sort(characters);
            String key = new String(characters);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            List<String> list = map.get(key);
            list.add(s);
        }
        return new ArrayList<>(map.values());
    }
}