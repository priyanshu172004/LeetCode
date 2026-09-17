class Solution:
    def minSumOfLengths(self, arr: List[int], target: int) -> int:
        n = len(arr)

        best = [float("inf")] * n

        Sum = 0
        left = 0
        minimum = float("inf")

        for right in range(n):
            Sum += arr[right]

            while Sum > target:
                Sum -= arr[left]
                left += 1

            if Sum == target:
                length = right - left + 1

                # Check for a previous subarray that ends
                # before the current subarray starts
                if left > 0 and best[left - 1] != float("inf"):
                    minimum = min(minimum, length + best[left - 1])

                best[right] = length

            # Carry forward the shortest previous subarray
            if right > 0:
                best[right] = min(best[right], best[right - 1])

        if minimum == float("inf"):
            return -1

        return minimum