class Solution:
    def minChanges(self, s: str) -> int:
        left = 0
        right = 1
        count = 0
        while right < len(s):
            if s[left] != s[right]:
                count += 1
            left = right + 1
            right += 2
        return count
        