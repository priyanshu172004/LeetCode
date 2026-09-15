class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        hashMap = {}
        for word in range(0, 1):
            for char in words[word]:
                hashMap[char] = hashMap.get(char, 0) + 1

        result = []
        for key, value in hashMap.items():
            count = value
            for word in words:
                temp = {}
                for char in word:
                    temp[char] = temp.get(char, 0) + 1
                if key not in temp:
                    count = 0
                    break
                count = min(count, temp[key])
            for i in range(count):
                result.append(key)
        return result

