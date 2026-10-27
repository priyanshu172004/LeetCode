class Solution:
    def createGrid(self, m: int, n: int) -> list[str]:
        grid = []
        for i in range(m):
            temp = []
            for j in range(n):
                temp.append("#")
            grid.append(temp)
        
        for i in range(1):
            for j in range(n):
                grid[i][j] = "."
        for i in range(m):
            grid[i][n - 1] = "."
        
        result = []
        for i in range(m):
            ans = ""
            for j in range(n):
                ans += grid[i][j]
            result.append(ans)
        return result





        
