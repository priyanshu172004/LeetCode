
class Solution:
    def minOperations(self, s: str) -> int:
        n = len(s)
        minChar = maxChar = s[0]
        isSorted = 1

        for i in range(1, n):
            if s[i] < s[i - 1]:
                isSorted = 0
            minChar = min(minChar, s[i])
            maxChar = max(maxChar, s[i])

        if isSorted:
            return 0

        if n == 2:
            return -1

        if s[0] == minChar or s[-1] == maxChar:
            return 1

        for i in range(1, n - 1):
            if s[i] == minChar or s[i] == maxChar:
                return 2

        return 3
