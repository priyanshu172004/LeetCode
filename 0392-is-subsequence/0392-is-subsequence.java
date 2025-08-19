class Solution {
    public boolean isSubsequence(String s, String t){
        int s_new = 0;
        int t_new = 0;
        while(s_new < s.length() && t_new < t.length()){
            if(s.charAt(s_new) == t.charAt(t_new)){
                s_new++;
            }
            t_new++;
        }
        if(s_new == s.length()){
            return true;
        }
        return false;
    }
}