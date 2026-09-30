class Solution:
    def majorityElement(self, nums: list[int]) -> list[int]:
        hashMap = {}
        for i in nums:
            hashMap[i] = hashMap.get(i, 0) + 1
        print(hashMap)

        count = 0
        result = []
        for key, val in hashMap.items():
            if hashMap[key] > len(nums)//3:
                result.append(key)
        return result

