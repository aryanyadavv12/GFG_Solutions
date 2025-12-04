class Solution:
    def missingNum(self, arr):
        # code here
        sorted_arr = sorted(arr)
        for i in range(len(arr)):
            if sorted_arr[i] != i+1:
                return i+1
                break
        return max(arr)+1