class Solution:
    def minimizeSum(self, nums: List[int]) -> int:
        nums.sort()
        print(nums)

        ans1 = 0
        maxx = max(nums[2: len(nums)])
        minn = min(nums[2: len(nums)])
        ans1 = maxx - minn
        
        ans2 = 0
        maxx = max(nums[0:len(nums) - 2])
        minn = min(nums[0:len(nums) - 2])
        ans2 = maxx - minn

        ans3 = 0
        maxx = max(nums[1: len(nums) - 1])
        minn = min(nums[1: len(nums) - 1])
        ans3 = maxx - minn

        return min(ans1, ans2, ans3)

         






        
