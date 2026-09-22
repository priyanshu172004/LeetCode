class Solution:
    def minOperations(self, boxes: str) -> list[int]:
        result = []
        for i in range(len(boxes)):
            right = len(boxes) - 1
            steps = 0
            while right >= 0:
                if right != i and boxes[right] == '1':
                    steps += abs(right - i)
                right -= 1
            result.append(steps)
        return result