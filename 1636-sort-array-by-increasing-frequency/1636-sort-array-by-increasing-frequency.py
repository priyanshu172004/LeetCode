class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        hashMap = {}
        for i in nums:
            hashMap[i] = hashMap.get(i, 0) + 1
        hashMap = dict(sorted(hashMap.items(), key = lambda item: (item[1], -item[0])))
        
        result = []
        for key, value in hashMap.items():
            for i in range(value):
                result.append(key)

        return result