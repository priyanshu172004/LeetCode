from fractions import Fraction
class Solution:
    def interchangeableRectangles(self, rectangles: list[list[int]]) -> int:
        hashMap = {}
        count = 0
        for rect in rectangles:
            w = rect[0]
            h = rect[1]
            ratio = w / h
            if ratio in hashMap:
                count += hashMap.get(ratio, 0)
            hashMap[ratio] = hashMap.get(ratio, 0) + 1
        return count
            