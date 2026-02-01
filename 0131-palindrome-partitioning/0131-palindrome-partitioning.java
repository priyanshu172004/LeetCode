class Solution {
    public Boolean isPalindrome(String part){
        String s = new StringBuilder(part).reverse().toString();
        if(!part.equals(s)){
            return false;
        }
        return true;
    }
    public void getAllPartitions(String s, List<String> partition, List<List<String>> result){
        if(s.length() == 0){
            result.add(new ArrayList<>(partition));
            return;
        }
        for(int i = 0; i < s.length(); i++){
            String part = s.substring(0, i + 1);
            if(isPalindrome(part)){
                partition.add(part);
                getAllPartitions(s.substring(i+1), partition, result);
                partition.remove(partition.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> partition = new ArrayList<>();
        getAllPartitions(s, partition, result);
        return result;
    }
}