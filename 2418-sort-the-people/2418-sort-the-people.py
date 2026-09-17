class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        hashMap = {}
        for name, height in zip(names, heights):
            hashMap[height] = name
        hashMap = dict(sorted(hashMap.items(), reverse = True))

        result = []
        for key, val in hashMap.items():
            result.append(val)
        return result
        
                 