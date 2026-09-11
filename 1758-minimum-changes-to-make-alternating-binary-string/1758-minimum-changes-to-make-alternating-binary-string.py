class Solution:
    def minOperations(self, s: str) -> int:
        count_0 = 0
        count_1 = 0
        for i, char in enumerate(s):
            if i % 2 == 0:
                if char == "0":
                    count_1 += 1
                else:
                    count_0 += 1
            else:
                if char == "1":
                    count_1 += 1
                else:
                    count_0 += 1
        return min(count_0, count_1)