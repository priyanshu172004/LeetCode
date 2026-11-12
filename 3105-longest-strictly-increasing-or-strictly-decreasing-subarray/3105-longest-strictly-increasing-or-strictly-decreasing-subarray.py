class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        left = 0
        right = 1
        maxx = 1

        countInc = 1
        countDec = 1

        while right < len(nums):
            if nums[right] > nums[left]:
                countInc += 1
                countDec = 1
            elif nums[right] < nums[left]:
                countDec += 1
                countInc = 1
            else:
                countInc = 1
                countDec = 1

            maxx = max(maxx, countInc, countDec)
            left = right
            right += 1
            
        return maxx
