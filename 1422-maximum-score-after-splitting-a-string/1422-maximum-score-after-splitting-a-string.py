class Solution:
    def maxScore(self, s: str) -> int:
        maxCount = 0
        for i in range(1, len(s)):
            countZero = 0
            countOne = 0
            for j in range(0, i):
                if s[j] == "0":
                    countZero += 1
            for k in range(i, len(s)):
                if s[k] == "1":
                    countOne += 1
            maxCount = max(maxCount, countZero + countOne)
        return maxCount
