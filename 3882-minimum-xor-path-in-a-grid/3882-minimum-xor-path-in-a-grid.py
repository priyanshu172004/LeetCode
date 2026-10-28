class Solution:
    def minCost(self, grid: list[list[int]]) -> int:
        rows = len(grid)
        cols = len(grid[0])

        dp = [[set() for _ in range(cols)] for _ in range(rows)]
        dp[0][0].add(grid[0][0])

        for i in range(rows):
            for j in range(cols):
                if i == 0 and j == 0:
                    continue

                if i > 0:
                    for x in dp[i - 1][j]:
                        dp[i][j].add(x ^ grid[i][j])

                if j > 0:
                    for x in dp[i][j - 1]:
                        dp[i][j].add(x ^ grid[i][j])

        return min(dp[rows - 1][cols - 1])