class Solution(object):
    def replaceElements(self, arr):
        """
        :type arr: List[int]
        :rtype: List[int]
        """
        n = len(arr)
        lst = [0] * n
        rightMax = -1
        for i in range(n - 1, -1, -1):
            lst[i] = rightMax
            rightMax = max(rightMax, arr[i])
        return lst
