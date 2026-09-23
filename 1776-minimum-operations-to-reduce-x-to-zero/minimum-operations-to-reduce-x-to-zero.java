class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0, l =0 ,maxlen =-1;
        for(int i =0 ;i< nums.length ;i++){
            sum+=nums[i];
        }
        int target = sum - x ;
        int currsum = 0;
        if( target < 0) return -1;
        if(target == 0 ) return nums.length;
        for(int r = 0; r < nums.length; r++){
            currsum += nums[r];
            while(currsum > target && l<=r){
                currsum -= nums[l];
                l++;
            }
            if(currsum == target){
            maxlen = Math.max(maxlen, r-l+1);
            }

        }
        return maxlen == -1 ? -1 : nums.length- maxlen;
    }
}