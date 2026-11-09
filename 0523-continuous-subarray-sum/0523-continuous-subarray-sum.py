class Solution:
    def checkSubarraySum(self, nums: list[int], k: int) -> bool:
        hashMap = {0 : -1}
        summ = 0
        for i in range(len(nums)):
            summ += nums[i]
            rem = summ % k

            if rem in hashMap:
                if i - hashMap[rem] >= 2:
                    return True
            else:
                hashMap[rem] = i
        return False