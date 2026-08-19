class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        hashMap = {}
        maxx = 0
        res = 0
        for index in nums:
            hashMap[index] = hashMap.get(index, 0) + 1
            if hashMap.get(index) > maxx:
                maxx = hashMap.get(index)
                res = index
        print(hashMap)
        return res

