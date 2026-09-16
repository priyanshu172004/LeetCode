class Solution:
    def vowelStrings(self, words: List[str], queries: List[List[int]]) -> List[int]:
        vowel = ('a','e','i','o','u','A','E','I','O','U')
        prefix = []
        count = 0
        for word in words:
            if word.startswith(vowel) and word.endswith(vowel):
                count += 1
            prefix.append(count)

        result = []
        for query in queries:
            start = query[0]
            end = query[1]
            if start == 0:
                result.append(prefix[end])
            else:
                result.append(prefix[end] - prefix[start - 1])
        return result
                




