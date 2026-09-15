class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        hashMap = {}

        for char in words[0]:
            hashMap[char] = hashMap.get(char, 0) + 1

        for word in words[1:]:
            temp = {}

            for char in word:
                temp[char] = temp.get(char, 0) + 1

            for key in hashMap:
                if key in temp:
                    hashMap[key] = min(hashMap[key], temp[key])
                else:
                    hashMap[key] = 0

        result = []

        for key, value in hashMap.items():
            for i in range(value):
                result.append(key)

        return result