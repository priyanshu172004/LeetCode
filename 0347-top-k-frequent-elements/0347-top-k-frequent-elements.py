class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        hashMap = {}
        for num in nums:
            hashMap[num] = hashMap.get(num, 0) + 1

        h = []
        for i in hashMap:
            h.append(hashMap.get(i, 0))
        maxHeap = [-n for n in h]
        heapq.heapify(maxHeap)

        result = []
        while len(result) < k:
            freq = -(heapq.heappop(maxHeap))
            for i in hashMap:
                if hashMap[i] == freq and i not in result:
                    result.append(i)
                    if len(result) == k:
                        break
        return result


                
