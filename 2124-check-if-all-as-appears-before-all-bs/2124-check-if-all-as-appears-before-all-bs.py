class Solution:
    def checkString(self, s: str) -> bool:
        if "a" in s:
            idx = s.rfind("a")
        else:
            return True
        for char in s[0:idx]:
            if char == "b":
                return False
        return True
