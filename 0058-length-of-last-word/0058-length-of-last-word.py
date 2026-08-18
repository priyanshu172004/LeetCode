class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        new_str = s.strip()
        result = s.split()[-1]
        return len(result)
