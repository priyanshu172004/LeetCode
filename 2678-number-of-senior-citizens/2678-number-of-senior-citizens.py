class Solution:
    def countSeniors(self, details: List[str]) -> int:
        age_above_60 = 0
        for ids in details:
            age = int(ids[-4: -2])
            if age > 60:
                age_above_60 += 1

        return age_above_60

