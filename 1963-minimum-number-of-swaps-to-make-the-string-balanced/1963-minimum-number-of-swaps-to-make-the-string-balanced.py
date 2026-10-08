class Solution:
    def minSwaps(self, s: str) -> int:
        count = 0
        for p in s:
            if p == "[":
                count += 1
            elif count > 0:
                count -= 1
        return (count + 1)//2

                