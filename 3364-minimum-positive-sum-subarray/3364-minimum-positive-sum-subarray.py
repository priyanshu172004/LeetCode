class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:
        minn = float('inf')

        for size in range(l, r + 1):
            summ = 0
            left = 0

            for right in range(len(nums)):
                summ += nums[right]

                if right - left + 1 > size:
                    summ -= nums[left]
                    left += 1

                if right - left + 1 == size and summ > 0:
                    minn = min(minn, summ)

        return minn if minn != float('inf') else -1