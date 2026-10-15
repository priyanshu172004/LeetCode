class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        summ = 0
        for i in range(len(nums)):
            hashSet = set()
            for j in range(i, len(nums)):
                hashSet.add(nums[j])
                summ += len(hashSet) ** 2
        return summ