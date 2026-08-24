class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        result = []
        hashSet = set(nums)

        for num in range(1, len(nums) + 1):
            if num not in hashSet:
                result.append(num)
        return result
