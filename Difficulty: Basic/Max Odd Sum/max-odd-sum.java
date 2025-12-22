class Solution {
    public int findMaxOddSum(int[] arr) {
        // code here
        //Aryan
        int sum = 0;
       boolean oddexist = false;
       int minOdd = Integer.MAX_VALUE;
       for(int num : arr){
           if(num > 0){
               sum = sum + num;
           }
           if(num%2 != 0){
               oddexist = true;
               minOdd = Math.min(minOdd,Math.abs(num));
           }
       }
       if(!oddexist){
           return -1;
       }
       if(sum %2 == 0){
           sum = sum - minOdd;
       }
       return sum;
    }
}
