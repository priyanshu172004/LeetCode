class Solution:
    def majorityElement(self, nums: list[int]) -> list[int]:
        candidate1 = -1
        candidate2 = -1
        votes1 = 0
        votes2 = 0

        for i in range(len(nums)):
            if nums[i] == candidate1:
                votes1 += 1
            elif nums[i] == candidate2:
                votes2 += 1
            elif votes1 == 0:
                candidate1 = nums[i]
                votes1 = 1
            elif votes2 == 0:
                candidate2 = nums[i]
                votes2 = 1
            else:
                votes1 -= 1
                votes2 -= 1


        count1 = 0
        count2 = 0
        for i in range(len(nums)):
            if nums[i] == candidate1:
                count1 += 1
            elif nums[i] == candidate2:
                count2 += 1
        
        result = []
        if count1 > len(nums) // 3:
            result.append(candidate1)
        if count2 > len(nums) // 3:
            result.append(candidate2)

        return result