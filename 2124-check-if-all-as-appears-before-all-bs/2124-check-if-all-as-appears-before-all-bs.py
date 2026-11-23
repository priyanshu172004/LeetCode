class Solution:
    def checkString(self, s: str) -> bool:
        hashSet = set()
        for char in s:
            if char == "b":
                hashSet.add(char)
            elif char == "a":
                if "b" in hashSet:
                    return False
        return True     