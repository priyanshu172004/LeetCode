class Solution:
    def checkDivisibility(self, n: int) -> bool:
        summ = 0
        product = 1
        cummulative = 0
        for digit in str(n):
            summ += int(digit)
            product *= int(digit)
        cummulative = summ + product
        if n % cummulative == 0:
            return True
        return False

