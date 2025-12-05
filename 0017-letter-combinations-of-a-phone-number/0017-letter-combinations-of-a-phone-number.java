class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return result;
        }
        String map[] = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

        backtrack(0, digits, new StringBuilder(), result, map);
        return result;
    } 
    private static void backtrack(int idx, String digits, StringBuilder current, ArrayList<String> result, String[] map){
        if(idx == digits.length()){
            result.add(current.toString());
            return;
        }
        char ch = digits.charAt(idx);
        String letters = map[ch - '0'];

        for(int i = 0; i < letters.length(); i++){
            current.append(letters.charAt(i));
            backtrack(idx + 1, digits, current, result, map);
            current.deleteCharAt(current.length() - 1);
        }
    }
}