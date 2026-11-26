class Solution:
    def canAliceWin(self, n: int) -> bool:
        if n < 10:
            return False

        for i in range(10, 0, -1):
            if i % 2 == 0:
                n -= i
                if n < 0:
                    return False
            else:
                n -= i
                if n < 0:
                    return True
        return True