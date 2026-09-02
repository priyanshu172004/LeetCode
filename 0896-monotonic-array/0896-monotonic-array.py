class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        n = len(nums)
        if n == 1:
            return True

        is_Dec = True
        is_Inc = True
        for i in range(1, n):
            if not is_Dec and not is_Inc:
                return False
            if nums[i] > nums[i - 1]:
                is_Dec = False 
            if nums[i] < nums[i - 1]:
                is_Inc = False
        return is_Inc or is_Dec