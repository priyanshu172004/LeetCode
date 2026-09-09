class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        if sentence[0] != sentence[-1]:
            return False
        for char in range(len(sentence)):
            if sentence[char] == " ":
                if sentence[char - 1] != sentence[char + 1]:
                    return False
        return True

        
        