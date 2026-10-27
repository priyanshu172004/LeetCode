class Solution:
    def createGrid(self, m: int, n: int) -> list[str]:
        grid = []
        for i in range(m):
            temp = []
            for j in range(n):
                temp.append("#")
            grid.append(temp)
        
        
        for j in range(n):
            grid[0][j] = "."
        for i in range(m):
            grid[i][n - 1] = "."
        
        result = []
        for i in range(m):
            ans = ""
            for j in range(n):
                ans += grid[i][j]
            result.append(ans)
        return result