class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        hashMap = {}
        temp = {}
        summ = 0
        for ch in chars:
            hashMap[ch] = hashMap.get(ch, 0) + 1
            temp[ch] = temp.get(ch, 0) + 1
        for word in words:
            countLength = len(word)
            count = 0
            for char in word:
                if char in hashMap and hashMap[char] > 0:
                    hashMap[char] = hashMap.get(char) - 1
                    count += 1
                if countLength == count:
                    summ += countLength
            hashMap = temp.copy()
        return summ