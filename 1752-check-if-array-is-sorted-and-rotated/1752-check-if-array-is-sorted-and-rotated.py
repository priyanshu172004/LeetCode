class Solution:
    def check(self, nums: List[int]) -> bool:
        n = len(nums)
        original = sorted(nums)
        for j in range(n):
            valid = True
            for i in range(n):
                if nums[i] != original[(i + j) % n]:
                    valid = False
                    break
            if valid:
                return True
        return False
