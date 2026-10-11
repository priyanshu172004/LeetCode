class Solution:
    def gridGame(self, grid: list[list[int]]) -> int:
        ans = math.inf
        topSum = sum(grid[0])
        bottomSum = 0

        for i in range(len(grid[0])):
            topSum -= grid[0][i]
            ans = min(ans, max(topSum, bottomSum))
            bottomSum += grid[1][i]
        
        return ans
        