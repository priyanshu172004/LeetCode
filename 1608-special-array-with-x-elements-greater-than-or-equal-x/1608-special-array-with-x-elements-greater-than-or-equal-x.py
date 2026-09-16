class Solution:
    def specialArray(self, nums: List[int]) -> int:
        for num in range(1, len(nums) + 1):
            count = 0
            isSpecial = False

            for i in nums:
                if i >= num:
                    count += 1

            if count == num:
                isSpecial = True

            if isSpecial == True:
                return num

        return -1