class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        s = Counter(arr)
        for i in s:
            if s[i] == 1:
                k -= 1
                if k == 0:
                    return i
        return ""