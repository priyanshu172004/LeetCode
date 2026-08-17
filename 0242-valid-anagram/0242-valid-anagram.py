class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if(len(s) != len(t)):
            return False
        new_s = "".join(sorted(s))
        new_t = "".join(sorted(t))
        if new_s == new_t:
            return True
        return False
        