class Solution:
    def makeEqual(self, words: List[str]) -> bool:
        string = ""
        for word in words:
            string += word
        
        hashMap = {}
        for char in string:
            hashMap[char] = hashMap.get(char, 0) + 1
        
        for key, value in hashMap.items():
                if value % len(words) != 0:
                    return False
        return True

