// User function Template for Java

class Solution {
    static int start = -1, end = -1;

    static int[] findIndex(int arr[], int key) {
        start = -1;
        end = -1;
        solve(arr, key, 0);
        return new int[]{start, end};
    }

    static void solve(int arr[], int key, int i) {
        if (i == arr.length) return;
        if (arr[i] == key) {
            if (start == -1) start = i;
            end = i;
        }
        solve(arr, key, i + 1);
    }
}
