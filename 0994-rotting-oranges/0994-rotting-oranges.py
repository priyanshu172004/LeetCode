class Solution:
    def orangesRotting(self, grid: list[list[int]]) -> int:
        rows = len(grid)
        cols = len(grid[0])

        queue = deque()
        fresh = 0

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 2:
                    queue.append((r, c))
                elif grid[r][c] == 1:
                    fresh += 1

        if fresh == 0:
            return 0

        return self.bfs(grid, queue, fresh, rows, cols)

    def bfs(self, grid, queue, fresh, rows, cols):
        directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
        time = 0

        while queue and fresh > 0:
            size = len(queue)
            for _ in range(size):
                r, c = queue.popleft()

                for dr, dc in directions:
                    nr = r + dr
                    nc = c + dc

                    if 0 <= nr < rows and 0 <= nc < cols:
                        if grid[nr][nc] == 1:
                            grid[nr][nc] = 2
                            fresh -= 1

                            queue.append((nr, nc))
            time += 1

        if fresh > 0:
            return -1
        return time

