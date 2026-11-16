class Solution:
    def numOfSubarrays(self, arr: list[int]) -> int:
        hashMap = {0: 1}
        summ = 0
        res = 0

        for num in arr:
            summ += num

            if (summ % 2) == 1:
                res += hashMap.get(0, 0)
            else:
                res += hashMap.get(1, 0)

            hashMap[summ % 2] = hashMap.get(summ % 2, 0) + 1

        return res % 1000000007