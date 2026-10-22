class Solution:
    def minOperations(self, nums: List[int]) -> int:
        n = len(nums)

        isSorted = True
        maxIdx = 0
        for i in range(n):
            if i != n - 1 and nums[i] > nums[i + 1]:
                isSorted = False
            if nums[i] > nums[maxIdx]:
                maxIdx = i
        if isSorted:
            return 0

        for i in range(n):
            diff = abs(nums[i] - nums[(i + 1) % n])
            if diff != 1 and diff != n - 1:
                return -1 

        return min(maxIdx, n - maxIdx) + 1