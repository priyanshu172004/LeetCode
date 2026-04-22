class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        int start = end;
        int count = 0;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
            count++;
        }
        return count;        
    }
}