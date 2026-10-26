class Solution:
    def closedIsland(self, grid: list[list[int]]) -> int:
        rows = len(grid)
        cols = len(grid[0])

        count = 0
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 0:
                    if not self.dfs(grid, r, c):
                        count += 1
        return count


    def dfs(self, grid, r, c) -> bool:
        rows = len(grid)
        cols = len(grid[0])

        if r < 0 or r >= rows or c < 0 or c >= cols:
            return True

        if grid[r][c] == 1:
            return False
        grid[r][c] = 1

        up = self.dfs(grid, r - 1, c)
        down = self.dfs(grid, r + 1, c)
        left = self.dfs(grid, r, c - 1)
        right = self.dfs(grid, r, c + 1)

        return up or down or left or right

