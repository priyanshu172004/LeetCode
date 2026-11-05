class Solution:
    def findTheDistanceValue(self, arr1: list[int], arr2: list[int], d: int) -> int:
        arr2.sort()

        count = 0

        for i in range(len(arr1)):
            left = 0
            right = len(arr2) - 1
            found = False

            while left <= right:
                mid = left + (right - left) // 2

                if abs(arr1[i] - arr2[mid]) <= d:
                    found = True
                    break
                elif arr2[mid] < arr1[i]:
                    left = mid + 1
                else:
                    right = mid - 1

            if not found:
                count += 1

        return count