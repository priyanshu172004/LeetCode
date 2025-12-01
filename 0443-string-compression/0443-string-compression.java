class Solution {
    public int compress(char[] chars) {
        int left = 0;
        int right = 0;
        while(right < chars.length){
            int count = 0;
            char ch = chars[right];
            while(right < chars.length && chars[right] == ch){
                right++;
                count++;
            }
            chars[left++] = ch;
            if (count > 1) {
                String s = Integer.toString(count);
                for (char c : s.toCharArray()) {
                    chars[left++] = c;
                }
            }
        }
        return left;
    }
}