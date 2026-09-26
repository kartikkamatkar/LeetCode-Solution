class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l =1 ;
        int r = 0 ;
        for(int i : weights){
            l = Math.max(i,l);
            r += i;
        }
        int ans = r ;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(check(weights , days, mid)){
                ans = mid ;
                r = mid -1;
            }
            else
            {
                l = mid +1 ;
            }
            
        }
        return ans ;
    }
    public boolean check(int weights[],int days, int capacity ){
        int dayused = 1;
        int currload = 0 ;
        for(int i = 0 ;i< weights.length ;i++){
            if(currload+ weights[i] <= capacity){
                currload +=weights[i];
            }
            else{
                dayused ++;
                currload = weights[i];
            }
            if(dayused > days  ){
                return false ;
            }
        }
        return true  ;
    }
        
}