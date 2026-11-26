class Solution:
    def canAliceWin(self, n: int) -> bool:
        if n < 10:
            return False

        ans = False
        for i in range(10, 0, -1):
            if i % 2 == 0:
                n -= i
                if n < 0:
                    ans = False
                    break
            else:
                n -= i
                if n < 0:
                    ans = True
                    break
        return ans