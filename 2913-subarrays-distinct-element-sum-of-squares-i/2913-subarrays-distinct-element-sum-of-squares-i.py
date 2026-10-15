class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        summ = 0
        for i in range(len(nums)):
            hashSet = set()
            for j in range(i, len(nums)):
                temp = nums[i: j + 1]
                for num in temp:
                    hashSet.add(num)
                summ += len(hashSet) ** 2
            print(hashSet)
        return summ