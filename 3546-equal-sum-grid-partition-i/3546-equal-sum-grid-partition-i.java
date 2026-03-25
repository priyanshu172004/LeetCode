class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        long total = 0;
        for(int[] gridRow : grid){
            for(int i : gridRow){
                total += i;
            }
        }
        long sum = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                sum += grid[i][j];
            }
            if(sum == total - sum) return true;
        }
        sum = 0;
        for(int j = 0; j < col; j++){
            for(int i = 0; i < row; i++){
                sum += grid[i][j];
            }
            if(sum == total - sum) return true;
        }
        return false;
    }
}