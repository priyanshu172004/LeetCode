class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        string = "balloon"
        count_ballon = 0
        hashMap = {}
        for ch in text:
            hashMap[ch] = hashMap.get(ch, 0) + 1
        while True:
            wordCount = 0
            for char in string:
                if char in hashMap and hashMap[char] > 0:
                    hashMap[char] -= 1
                    wordCount += 1
                else:
                    return count_ballon
            if wordCount == len(string):
                count_ballon += 1
        return count_ballon