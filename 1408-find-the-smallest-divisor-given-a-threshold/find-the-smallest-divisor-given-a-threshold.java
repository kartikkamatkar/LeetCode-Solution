class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = 0 ;
        int ans = 1;
        for(int i = 0;i<nums.length ;i++){
            r = Math.max( r ,nums[i]);
        }
        while(l<=r){
            int mid = l+(r-l)/2;
            if(cheack(nums, mid , threshold)){
                ans = mid ;
                r = mid -1;
            }
            else {
                l = mid +1;
            }

        }
        return ans ;
    }
    public boolean cheack(int []nums, int mid , int threshold ){
        long sum = 0;
        for(int i : nums){
            sum+=(i+(long)mid-1)/mid;
        }
        if(sum > threshold){
            return false ;
        }
        return true ;
    }
    
}