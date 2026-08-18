class Solution(object):
    def scoreOfString(self, s):
        """
        :type s: str
        :rtype: int
        """
        left = 0
        right = 1
        summ = 0
        while right < len(s):
            left_char = ord(s[left])
            right_char = ord(s[right])
            summ += abs(left_char - right_char)

            left += 1
            right += 1
        return summ


        