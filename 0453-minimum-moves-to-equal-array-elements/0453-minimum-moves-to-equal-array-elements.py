class Solution:
    def minMoves(self, nums: list[int]) -> int:
        if len(nums) == 1:
            return 0

        nums.sort()
        countMoves = 0
        target = min(nums)

        for i in range(len(nums)):
            if nums[i] == target:
                continue
            countMoves += abs(nums[i] - target)
        return countMoves

