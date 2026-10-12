class Solution:
    def arraySign(self, nums: list[int]) -> int:
        prod = 1
        for num in nums:
            prod *= num
        if prod > 0:
            return 1
        elif prod < 0:
            return -1
        return 0