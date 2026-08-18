class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        new_str = s.strip()
        count = 0
        for char in range(len(new_str) - 1, -1, -1):
            if new_str[char] == " ":
                break
            count += 1
        return count
