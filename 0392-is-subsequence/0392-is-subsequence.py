class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        index = 0
        for char in t:
            if index < len(s) and s[index] == char:
                index += 1
        return index == len(s)