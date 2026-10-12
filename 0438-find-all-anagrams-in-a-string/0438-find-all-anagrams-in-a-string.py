class Solution:
    def findAnagrams(self, s: str, p: str) -> list[int]:
        k = len(p)
        result = []

        if k > len(s):
            return result

        hashMap = {}
        for char in p:
            hashMap[char] = hashMap.get(char, 0) + 1

        temp = {}
        for i in range(k):
            temp[s[i]] = temp.get(s[i], 0) + 1

        left = 0
        right = k - 1
        while right < len(s):
            if temp == hashMap:
                result.append(left)

            temp[s[left]] -= 1
            if temp[s[left]] == 0:
                del temp[s[left]]
            
            left += 1
            right += 1

            if right < len(s):
                temp[s[right]] = temp.get(s[right], 0) + 1

        return result