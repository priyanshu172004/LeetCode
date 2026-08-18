class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}
        for i, n in enumerate(nums):
            hashMap[n] = i
        for i, n in enumerate(nums):
            compliment = target - n
            if compliment in hashMap and hashMap[compliment] != i:
                return [i, hashMap[compliment]]
        return []