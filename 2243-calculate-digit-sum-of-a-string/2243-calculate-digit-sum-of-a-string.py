class Solution:
    def digitSum(self, s: str, k: int) -> str:
        while len(s) > k:
            left = 0
            right = k
            temp = []

            while left < len(s):
                if right > len(s):
                    right = len(s)
                summ = 0
                for char in s[left: right]:
                    summ += int(char)
                temp.append(str(summ))
                left = right
                right += k

            s = "".join(temp)
        return s

            


