class Solution:
    def uniformArray(self, nums1: list[int]) -> bool:
        for i in nums1:
            if i % 2 == 0:
                return True
        is_Even = True
        is_Odd = True
        for i in range(len(nums1) - 1):
            if (nums1[i] - nums1[i + 1]) % 2 == 0:
                is_Odd = False
            if (nums1[i] - nums1[i + 1]) % 2 != 0:
                is_Even = False
        return is_Odd or is_Even

