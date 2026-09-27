class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0 ;
        int r = 0 ;
        int ans = 0 ;
        for(int i : nums){
            l = Math.max(l, i);
            r +=i;
        }
        ans = r;
        while(l<=r){
            int mid = l +(r-l)/2;
            if( check(nums, k ,mid)){
                ans = mid ;
                r = mid - 1;
            }
            else{
               l = mid + 1;
            }
        }
        return ans;
    }
    public boolean check(int nums[], int k , int mid){
     int parts =1 ;
     int currsum = 0;
     for(int i : nums){
        if(currsum + i<= mid){
            currsum+=i;
        }
        else{
            parts++;
            currsum=i;
        }
     }
     return parts <=k;
    }
   
}