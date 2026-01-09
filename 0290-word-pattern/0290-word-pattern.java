class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.trim().split("\\s+");
        if(pattern.length() != words.length){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String str = words[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(str)){
                    return false;
                }
            }else{
                if(set.contains(str)){
                    return false;
                }
                set.add(str);
                map.put(ch, str);
            }
        }
        return true;
    }
}