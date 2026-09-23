class Solution:
    def longestConsecutive(self, nums: list[int]) -> int:
        nums = sorted(nums)
        
        Max = 0
        left = 0
        right = 0
        while right < len(nums):
            if right > 0 and nums[right] == nums[right - 1] + 1:
                Max = max(Max, right - left + 1)
                right += 1
            elif right > 0 and nums[right] == nums[right - 1]:
                right += 1
                left += 1
            else:
                left = right
                Max = max(Max, 1)
                right += 1
        return Max

