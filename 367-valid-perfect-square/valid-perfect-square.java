class Solution {
    public boolean isPerfectSquare(int num) {
       if(num < 2){
        return true ;
       }
       long l = 2 ;
       long r = num/2;
       while(l<=r){
        long mid = l+(r-l)/2;
        long ans = mid * mid ;
        if(ans == num){
            return true ;
        }
        if(ans > num){
            r = mid - 1;

        }
        else {
            l = mid +1;
        }
       }
       return false ;
    }
}