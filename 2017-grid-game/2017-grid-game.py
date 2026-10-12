class Solution:
    def gridGame(self, grid: list[list[int]]) -> int:
        firstBot = sum(grid[0])
        secondBot = 0
        ans = math.inf
        for i in range(len(grid[0])):
            firstBot -= grid[0][i]
            ans = min(ans, max(firstBot, secondBot))
            secondBot += grid[1][i]
        return ans
        