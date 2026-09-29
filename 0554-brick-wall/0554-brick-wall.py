class Solution:
    def leastBricks(self, wall: List[List[int]]) -> int:
        hashMap = {0:0}
        for bricks in wall:
            total = 0
            for b in bricks[:-1]:
                total += b
                hashMap[total] = 1 + hashMap.get(total, 0)
        return len(wall) - max(hashMap.values())