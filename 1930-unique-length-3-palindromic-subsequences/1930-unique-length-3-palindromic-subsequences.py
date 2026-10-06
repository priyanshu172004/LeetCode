class Solution:
    def countPalindromicSubsequence(self, s: str) -> int:
        count = 0

        for char in set(s):
            left = s.index(char)
            right = s.rindex(char)
            print(left, right)

            if left < right:
                middle = s[left + 1:right]
                unique = set(middle)
                count += len(unique)

        return count