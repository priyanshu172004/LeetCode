class Solution:
    def countPalindromicSubsequence(self, s: str) -> int:
        count = 0
        for char in set(s):
            left = s.index(char)
            right = s.rindex(char)

            if left < right:
                chars = s[left + 1: right]
                unique = set(chars)
                count += len(unique)

        return count

