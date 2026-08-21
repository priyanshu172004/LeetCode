class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        maxSum = nums[0]
        currSum = nums[0]
        left = 0
        right = 1
        while right < len(nums):
            if nums[right] > nums[left]:
                currSum += nums[right]
            else:
                currSum = nums[right]
            maxSum = max(currSum, maxSum)
            left = right
            right += 1
        return maxSum