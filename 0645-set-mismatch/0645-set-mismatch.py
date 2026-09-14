class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        hashSet = set()
        result = []
        for num in nums:
            if num in hashSet:
                result.append(num)
            else:
                hashSet.add(num)
        for i in range(1, len(nums) + 1):
            if i not in hashSet:
                result.append(i)
        return result
        
