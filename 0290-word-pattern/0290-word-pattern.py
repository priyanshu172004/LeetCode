class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        if len(words) != len(pattern):
            return False
        
        hashMap = {}
        for p, w in zip(pattern, words):
            key_p = ("p", p)
            key_w = ("w", w)

            if key_p in hashMap and hashMap[key_p] != w:
                return False
            if key_w in hashMap and hashMap[key_w] != p:
                return False
            hashMap[key_w] = p
            hashMap[key_p] = w
        return True