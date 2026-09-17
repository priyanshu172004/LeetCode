class Solution:
    def relativeSortArray(self, arr1: list[int], arr2: list[int]) -> list[int]:
        hashMap = {}
        for i in arr1:
            hashMap[i] = hashMap.get(i, 0) + 1

        result = []
        for i in arr2:
            while hashMap[i] != 0:
                result.append(i)
                hashMap[i] -= 1

        temp = []
        for i in hashMap:
            while hashMap[i] != 0:
                temp.append(i)
                hashMap[i] -= 1
    
        return result + sorted(temp)
