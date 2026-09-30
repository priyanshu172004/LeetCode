class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        maxProfit = 0
        profit = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[i - 1]:
                profit += prices[i] - prices[i - 1]
                maxProfit = max(maxProfit, profit)
        return maxProfit