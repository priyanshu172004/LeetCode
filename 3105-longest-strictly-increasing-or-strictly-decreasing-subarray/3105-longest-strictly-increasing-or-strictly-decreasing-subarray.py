class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        left = 0
        right = 1
        maxx = 1

        count = 1
        isIncreasing = False
        isDecreasing = False

        while right < len(nums):
            if nums[right] > nums[left]:
                if isIncreasing:
                    count += 1
                else:
                    count = 2

                isIncreasing = True
                isDecreasing = False

            elif nums[right] < nums[left]:
                if isDecreasing:
                    count += 1
                else:
                    count = 2

                isDecreasing = True
                isIncreasing = False

            else:
                count = 1
                isIncreasing = False
                isDecreasing = False

            maxx = max(maxx, count)

            left = right
            right += 1

        return maxx