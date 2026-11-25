class Solution:
    def maxLength(self, nums: List[int]) -> int:
        maxLength = 1
        for left in range(len(nums)):
            prod = 1
            gcd = 0
            lcm = 1
            for right in range(left, len(nums)):
                prod *= nums[right]
                gcd = math.gcd(gcd, nums[right])
                lcm = math.lcm(lcm, nums[right])

                if prod == gcd * lcm:
                    maxLength = max(maxLength, right - left + 1)
        return maxLength