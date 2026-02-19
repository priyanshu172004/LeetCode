class Solution {
    public int findMinPath(int[][] matrix, int[][] dp, int m, int n){
        for(int j = 0; j < n; j++){
            dp[0][j] = matrix[0][j];
        }
        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                int up = matrix[i][j] + dp[i - 1][j];
                int leftD = Integer.MAX_VALUE;
                if(j - 1 >= 0){
                    leftD = matrix[i][j] + dp[i - 1][j - 1];
                }
                int rightD = Integer.MAX_VALUE;
                if(j + 1 < n){
                    rightD = matrix[i][j] + dp[i - 1][j + 1];
                }
                dp[i][j] = Math.min(up, Math.min(leftD, rightD));
            }
        }
        int maxx = Integer.MAX_VALUE;
        for(int j = 0; j < n; j++){
            maxx = Math.min(maxx, dp[n - 1][j]);
        }
        return maxx;
    }
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        return findMinPath(matrix, dp, m, n);
    }
}