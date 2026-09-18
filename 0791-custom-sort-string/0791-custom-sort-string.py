class Solution:
    def customSortString(self, order: str, s: str) -> str:
        hashMap = {}
        for char in s:
            hashMap[char] = hashMap.get(char, 0) + 1
        ans = ""
        for ch in order:
            while hashMap.get(ch, 0) != 0:
                ans += ch
                hashMap[ch] -= 1
        for i in hashMap:
            while hashMap.get(i, 0) != 0:
                ans += i
                hashMap[i] -= 1
        return ans