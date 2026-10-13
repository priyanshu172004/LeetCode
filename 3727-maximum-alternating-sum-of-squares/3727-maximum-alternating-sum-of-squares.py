class Solution:
    def maxAlternatingSum(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]**2
        nums = [x**2 for x in nums]
        nums.sort()
        
        left = 0
        right = len(nums) - 1
        summ = 0
        while left < right:
            summ += nums[right] - nums[left]
            right -= 1
            left += 1
            if left == right:
                summ += nums[right]
        return summ

        