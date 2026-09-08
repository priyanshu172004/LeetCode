class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        hashSet = set()
        for char in allowed:
            hashSet.add(char)

        count = 0
        for word in words:
            n = 0
            for char in word:
                if char in hashSet:
                    n += 1
                if n == len(word):
                    count += 1
        return count
        
        