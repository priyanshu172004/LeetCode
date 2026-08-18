class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        ans = []
        words = sorted(words)
        print(words)
        left = 0
        for i in range(len(words)):
            for j in range(len(words)):
                if i != j and words[i] in words[j]:
                    ans.append(words[i])
                    break
        return ans
