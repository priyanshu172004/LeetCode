class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        countGoodPairs = 0
        hashMap = {}
        for i in range(len(nums)):
            hashMap[i] = nums[i]
        
        data = list(hashMap.items())
        for i in range(len(data)):
            for j in range(i + 1, len(data)):
                key1, value1 = data[i]
                key2, value2 = data[j]
                
                if value1 == value2:
                    countGoodPairs += 1
                    
        return countGoodPairs
