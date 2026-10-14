class Solution:
    def maxSumOfSquares(self, num: int, sum: int) -> str:
        if sum > num * 9:
            return ""

        ans = ""
        count = 0

        while sum > 9 and count < num:
            ans += "9"
            sum -= 9
            count += 1

        if count < num and sum > 0:
            ans += str(sum)
            count += 1

        while count < num:
            ans += "0"
            count += 1

        return ans