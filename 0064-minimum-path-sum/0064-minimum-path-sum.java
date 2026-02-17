class Solution {
    public int findMinPath(int m, int n, int[][] dp, int[][] grid){
        for(int i = 0; i <= m - 1; i++){
            for(int j = 0; j <= n - 1; j++){
                if(i == 0 && j == 0) dp[i][j] = grid[0][0];
                else{
                    int up = Integer.MAX_VALUE;
                    int left = Integer.MAX_VALUE;
                    if(i > 0) up = grid[i][j] + dp[i - 1][j];
                    if(j > 0) left = grid[i][j] + dp[i][j - 1];
                    dp[i][j] = Math.min(up, left);
                }
            }
        }
        return dp[m - 1][n - 1];
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        return findMinPath(m, n, dp, grid);
    }
}