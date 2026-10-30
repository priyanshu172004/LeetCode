class Solution:
    def largestNumber(self, nums: list[int]) -> str:
        nums = list(map(str, nums))

        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] < nums[j] + nums[i]:
                    nums[i], nums[j] = nums[j], nums[i]

        ans = ""
        for num in nums:
            ans += num

        if ans[0] == "0":
            return "0"
        return ans