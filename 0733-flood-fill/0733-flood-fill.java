class Solution {
    public void dfs(int[][] image, int r, int c, int orgColor, int newColor){
        int m = image.length;
        int n = image[0].length;
        if(r < 0 || r >= m || c < 0 || c >= n || image[r][c] != orgColor){
            return;
        }
        image[r][c] = newColor;
        dfs(image, r + 1, c, orgColor, newColor);
        dfs(image, r - 1, c, orgColor, newColor);
        dfs(image, r, c + 1, orgColor, newColor);
        dfs(image, r, c - 1, orgColor, newColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgColor = image[sr][sc];
        if(orgColor == color){
            return image;
        }
        dfs(image, sr, sc, orgColor, color);
        return image;
    }
}