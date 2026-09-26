class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int  l = 1 ;
        int  r = Integer.MIN_VALUE;
        for (int i : piles ){
            r = Math.max(i,r);
        }
        int ans = r;
        while(l<= r){
            int mid = l+(r-l)/2;
            if(check(piles , h , mid )){
                ans = mid ;
                r = mid - 1; 
            }
            else 
            {
                l = mid +1 ;
            }
        }
        return ans ;
    }
    public boolean check(int [] piles , int h , int k){
        long hour = 0 ;
        for(int i : piles ){
            hour += (i + (long) k-1 )/k;
            if(hour > h ){
                return false ;
            }
        }
        return true ;
    }
}