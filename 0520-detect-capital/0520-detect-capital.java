class Solution {
    public boolean findLowerCase(String word){
        for(int i = 1; i < word.length(); i++){
            if(!Character.isLowerCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public boolean findUpperCase(String word){
        for(int i = 1; i < word.length(); i++){
            if(!Character.isUpperCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        char c = word.charAt(0);
        if(Character.isLowerCase(c)){
            return findLowerCase(word);
        }else if(Character.isUpperCase(c)){
            return findUpperCase(word) || findLowerCase(word);
        }
        return false;
    }
}