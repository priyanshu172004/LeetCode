class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()){
            return new String();
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int start = -1;
        int count = 0;
        int needed = t.length();
        int left = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                if(map.get(ch) > 0){
                    count++;
                }
                map.put(ch, map.get(ch) - 1);
            }

            while(count == needed){
                if(minLen > right - left + 1){
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar) + 1);
                    if(map.get(leftChar) > 0){
                        count--;
                    }
                }
            left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}