class Solution {
    public boolean isSortedhelp(int[] arr, int l){
        if(l==arr.length-1) return true;
        boolean faith=isSortedhelp(arr,l+1);
        boolean ans=arr[l]<=arr[l+1];
        return (faith && ans);
    }
    public boolean isSorted(int[] arr) {
        // code here
        return isSortedhelp(arr,0);
        
    }
}