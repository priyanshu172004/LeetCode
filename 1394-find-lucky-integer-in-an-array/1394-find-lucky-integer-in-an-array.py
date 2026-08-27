class Solution:
    def findLucky(self, arr: List[int]) -> int:
        hashMap = {}
        maxx = float("-inf")
        for integer in arr:
            hashMap[integer] = hashMap.get(integer, 0) + 1
        for key, value in hashMap.items():
            if key == value:
                maxx = max(maxx, key)
        
        return -1 if maxx == float("-inf") else maxx