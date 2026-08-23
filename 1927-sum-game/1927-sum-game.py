class Solution:
    def sumGame(self, num: str) -> bool:

        onLeft = 0
        onRight = 0
        leftSum = 0
        rightSum = 0

        for char in range(len(num)//2):
            if num[char] == "?":
                onLeft += 1
            else:
                leftSum += int(num[char])

        for char in range(len(num)//2, len(num)):
            if num[char] == "?":
                onRight += 1
            else:
                rightSum += int(num[char])

        if onLeft == onRight:
            return leftSum != rightSum

        if (onLeft - onRight) % 2 != 0:
            return True

        if onLeft > onRight:
            return leftSum + (onLeft - onRight) * 9 // 2 != rightSum

        return leftSum != rightSum + (onRight - onLeft) * 9 // 2