from fractions import Fraction
class Solution:
    def interchangeableRectangles(self, rectangles: list[list[int]]) -> int:
        hashMap = {}
        for rect in range(len(rectangles)):
            w = rectangles[rect][0]
            h = rectangles[rect][1]
            ratio = Fraction(w/h)
            hashMap[ratio] = hashMap.get(ratio, 0) + 1
        
        count = 0
        for val in hashMap.values():
            count += math.comb(val, 2)
        return count