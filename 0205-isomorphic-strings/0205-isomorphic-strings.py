class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        if s is None or t is None:
            return False
        hashMap_1 = {}
        hashMap_2 = {}
        
        for char_s, char_t in zip(s, t):
            if char_s in hashMap_1 and hashMap_1[char_s] != char_t:
                return False
            if char_t in hashMap_2 and hashMap_2[char_t] != char_s:
                return False
            hashMap_1[char_s] = char_t
            hashMap_2[char_t] = char_s
        return True
