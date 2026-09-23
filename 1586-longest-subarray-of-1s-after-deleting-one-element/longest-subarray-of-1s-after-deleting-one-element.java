class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int maxlen =0;
        int zerocount = 0;
        for(int r = 0;r < nums.length;r++){
            if(nums[r]==0){
                zerocount++;
            }
            while(zerocount>1){
                if(nums[l]==0){
                    zerocount--;
                }
                l++;
            }
            maxlen =Math.max(maxlen ,r-l);
        }
        return maxlen;
    }
}