class Solution:
    def checkDivisibility(self, n: int) -> bool:
        summ = 0
        product = 1
        for digit in str(n):
            summ += int(digit)
            product *= int(digit)
        if n % (summ + product) == 0:
            return True
        return False

