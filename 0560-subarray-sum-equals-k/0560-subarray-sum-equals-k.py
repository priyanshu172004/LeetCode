class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashMap = {0: 1}
        count = 0
        summ = 0
        for num in nums:
            summ += num

            if summ - k in hashMap:
                count += hashMap[summ - k]
            hashMap[summ] = hashMap.get(summ, 0) + 1
        return count

