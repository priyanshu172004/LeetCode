class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        k = len(needle)

        left = 0
        right = k - 1

        while right < len(haystack):
            string = haystack[left: right + 1]
            if string == needle:
                return left
            left += 1
            right += 1
            
        return -1