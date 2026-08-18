class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        index_i = 0
        index_j = 0
        while index_i < len(s) and index_j < len(t):
            if s[index_i] == t[index_j]:
                index_j += 1
            index_i += 1
        return len(t) - index_j