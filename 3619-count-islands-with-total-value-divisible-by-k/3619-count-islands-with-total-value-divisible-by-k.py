class Solution:
    def countIslands(self, grid: List[List[int]], k: int) -> int:
        rows = len(grid)
        cols = len(grid[0])
        count = 0
        summ = 0

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] != 0:
                    summ = self.dfs(grid, r, c) 
                    if summ % k == 0:
                        count += 1
        return count

    def dfs(self, grid, r, c) -> int:
        rows = len(grid)
        cols = len(grid[0])
        
        if r < 0 or r >= rows or c < 0 or c >= cols:
            return 0
        if grid[r][c] == 0:
            return 0

        summ = grid[r][c]
        grid[r][c] = 0

        summ += self.dfs(grid, r - 1, c)
        summ += self.dfs(grid, r + 1, c)
        summ += self.dfs(grid, r, c - 1)
        summ += self.dfs(grid, r, c + 1)

        return summ
        