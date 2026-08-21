class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        leftSum = 0
        rightSum = sum(nums)
        for i in range(len(nums)):
            pivotIndex = i
            rightSum -= nums[pivotIndex]
            if leftSum == rightSum:
                return pivotIndex
            leftSum += nums[pivotIndex]
        return -1