class Solution:
    def minMoves(self, nums: List[int]) -> int:
        maxx = max(nums)

        countMoves = 0
        for i in range(len(nums)):
            if nums[i] == maxx:
                continue
            countMoves += abs(nums[i] - maxx)
        
        return countMoves
            