class Solution:
    def minMoves2(self, nums: list[int]) -> int:
        nums.sort()
        left = 0
        right = len(nums) - 1
        mid = left + (right - left) // 2

        countMoves = 0
        for i in range(len(nums)):
            if i == mid:
                continue
            countMoves += abs(nums[i] - nums[mid])
        
        return countMoves
