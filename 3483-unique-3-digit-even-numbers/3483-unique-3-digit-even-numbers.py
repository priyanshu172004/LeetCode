class Solution:
    def totalNumbers(self, digits: List[int]) -> int:
        hashSet = set()
        for i in range(len(digits)):
            for j in range(len(digits)):
                for k in range(len(digits)):
                    if i == j or j == k or i == k:
                        continue
                    num = str(digits[i]) + str(digits[j]) + str(digits[k])
                    if digits[i] == 0:
                        continue
                    if int(num) % 2 == 0:
                        hashSet.add(int(num))
        return len(hashSet)