class Solution:
    def minimumIndex(self, nums: List[int]) -> int:
        hashMap1 = {}
        hashMap2 = {}

        for num in nums:
            hashMap2[num] = hashMap2.get(num, 0) + 1
        for mid in range(len(nums) - 1):
            num = nums[mid]
            hashMap1[num] = hashMap1.get(num, 0) + 1
            hashMap2[num] -= 1
            
            if hashMap1[num] > (mid + 1) // 2 and hashMap2[num] > (len(nums) - mid - 1) // 2:
                return mid
        return -1


