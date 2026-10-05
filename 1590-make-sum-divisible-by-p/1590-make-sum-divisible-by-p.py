class Solution:
    def minSubarray(self, nums: list[int], p: int) -> int:
        total = sum(nums)
        target = total % p

        if target == 0:
            return 0

        hashMap = {0 : -1}
        summ = 0
        result = len(nums)

        for i in range(len(nums)):
            summ += nums[i]
            remaining = summ % p

            needed = (remaining - target) % p

            if needed in hashMap:
                result = min(result, i - hashMap[needed])

            hashMap[remaining] = i
        
        if result == len(nums):
            return -1
        return result