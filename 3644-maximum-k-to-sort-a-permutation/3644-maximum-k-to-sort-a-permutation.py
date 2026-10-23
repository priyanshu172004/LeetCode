class Solution:
    def sortPermutation(self, nums: List[int]) -> int:
        n = len(nums)
        isSorted = True
        for i in range(n):
            if i != n - 1 and nums[i] > nums[i + 1]:
                isSorted = False
        if isSorted:
            return 0
        
        List = []
        for i in range(n):
            if nums[i] != i:
                List.append(nums[i])

        maxx = List[0]
        for i in range(len(List)):
            maxx = maxx & List[i]
        return maxx


            