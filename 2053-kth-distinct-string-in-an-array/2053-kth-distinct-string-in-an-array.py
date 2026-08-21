class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        hashMap = {}
        for s in arr:
            hashMap[s] = hashMap.get(s, 0) + 1
        for s in hashMap:
            if hashMap.get(s) == 1:
                k -= 1
                if k == 0:
                    return s
        return ""
