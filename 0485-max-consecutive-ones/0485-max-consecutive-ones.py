class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxx = 0
        left = 0
        right = 0
        while(right < len(nums)):
            if nums[right] == 1:
                maxx = max(maxx, right - left + 1)
                right += 1
            elif nums[right] == 0:
                right += 1
                left = right
        return maxx