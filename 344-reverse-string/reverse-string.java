class Solution {
    public void reverseString(char[] s) {
        function(s,0, s.length-1);
    }
    public char[] function(char [] arr, int l , int r){
        if(l >= r){
            return arr;
        }
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return function(arr , l + 1 , r -1);
    }
}