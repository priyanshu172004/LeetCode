class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        hashMap = {}
        result = []
        total_sum = sum(map(sum, grid))
        count = sum(len(row) for row in grid)

        for row in grid:
            for value in row:
                hashMap[value] = hashMap.get(value, 0) + 1
                if hashMap[value] > 1:
                    result.append(value)

        expected_sum = count * (count + 1) // 2
        repeated = result[0]
        result.append(repeated - (total_sum - expected_sum))
        return result