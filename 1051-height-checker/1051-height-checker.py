class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        expected = heights.copy()
        expected.sort()
        count = 0
        for i, j in zip(heights, expected):
            if i != j:
                count += 1
        return count