class Solution {
    public int findMinPath(List<List<Integer>> arr, int[][] dp, int n){
        int N = arr.size();
        for(int j = 0; j < n; j++){
            dp[N - 1][j] = arr.get(N - 1).get(j);
        }
        for(int i = N - 2; i >= 0; i--){
            for(int j = 0; j < i; j++){
                int down = arr.get(i).get(j) + dp[i + 1][j];
                int diag = arr.get(i).get(j) + dp[i + 1][j + 1]; 
                dp[i][j] = Math.min(down, diag);
            }
        }
        // if(i == n - 1){
        //     return arr.get(n - 1).get(j);
        // }
        // if(dp[i][j] != -1){
        //     return dp[i][j];
        // }
        return dp[0][0];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        // for(int[] row : dp){
        //     Arrays.fill(row, -1);
        // }
        return findMinPath(triangle, dp, n);
    }
}