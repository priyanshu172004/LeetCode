class Solution:
    def arraySign(self, nums: list[int]) -> int:
        if 0 in nums:
            return 0
        countNegative = 0
        for num in nums:
            if num < 0:
                countNegative += 1
        if countNegative % 2 == 0:
            return 1
        return -1