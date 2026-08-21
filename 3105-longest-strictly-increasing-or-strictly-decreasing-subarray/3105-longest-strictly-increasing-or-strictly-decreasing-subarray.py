class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        maxInc = 1
        maxDec = 1
        left = 0
        right = 1
        maxx = 1
        while right < len(nums):
            if nums[right] > nums[left]:
                maxInc += 1
                maxDec = 1
            elif nums[left] > nums[right]:
                maxDec += 1
                maxInc = 1
            else:
                maxInc = 1
                maxDec = 1
            maxx = max(maxx, maxInc, maxDec)
            left = right
            right += 1
        return maxx
        
