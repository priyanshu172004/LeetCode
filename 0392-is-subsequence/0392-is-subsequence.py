class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        indexI = 0
        indexJ = 0
        while indexI < len(s) and indexJ < len(t):
            if s[indexI] == t[indexJ]:
                indexI += 1
            indexJ += 1
        return indexI == len(s)


