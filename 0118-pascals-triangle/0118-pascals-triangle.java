class Solution {
    private static List<Integer> generatePascalSeries(int row){
        int ans = 1;
        List<Integer> list = new ArrayList<>(); 
        list.add(1);
        for(int col = 1; col <= row; col++){
            ans = ans * (row - col + 1);
            ans = ans / (col);
            list.add(ans);
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            result.add(generatePascalSeries(i));
        }
        return result;
    }
}