class Solution {
    public boolean isSubsequence(String s, String t) {
        int slength = 0;
        int tlength = 0;
        while(slength < s.length() && tlength < t.length()){
            if(s.charAt(slength) == t.charAt(tlength)){
                slength++;
            }
            tlength++;
        }
        return slength == s.length();
    }
}