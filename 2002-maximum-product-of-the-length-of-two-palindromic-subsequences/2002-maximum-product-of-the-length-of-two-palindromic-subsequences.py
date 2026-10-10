class Solution:
    def maxProduct(self, s: str) -> int:
        subs = [("", [])]
        for i in range(len(s)):
            new_subs = []
            for sub, indices in subs:
                new_subs.append((sub + s[i], indices + [i]))
            subs += new_subs
        
        palindrome = []
        for sub, indices in subs:
            if sub and self.isPalindrome(sub):
                palindrome.append((len(sub), indices))

        ans = 0
        for i in range(len(palindrome)):
            for j in range(i + 1, len(palindrome)):
                len1, idx1 = palindrome[i]
                len2, idx2 = palindrome[j]

                if set(idx1).isdisjoint(set(idx2)):
                    ans = max(len1 * len2, ans)
        return ans

    def isPalindrome(self, string: str) -> bool:
        return string == string[::-1]
        