class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        hashMap = {}
        stack = []
        for nums in nums2:
            while len(stack) != 0 and stack[-1] < nums:
                hashMap[stack.pop()] = nums
            stack.append(nums)
        while len(stack) > 0:
            hashMap[stack.pop()] = -1
        result = []
        for i in range(len(nums1)):
            result.append(hashMap.get(nums1[i]))
        return result