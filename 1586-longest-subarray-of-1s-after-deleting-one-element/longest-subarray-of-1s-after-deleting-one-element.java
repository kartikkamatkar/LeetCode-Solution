class Solution {
    public int longestSubarray(int[] nums) {
       int max = 0;
       int window = 0;
       int l = 0;
       int counter = 0;
       for(int r = 0;r <nums.length ;r++){
       
        if(nums[r]==1){
            window ++;
        }
        else{
                counter  ++;
            }
        while(counter > 1){
          if(nums[l]==1){
            window--;
          }
          if(nums[l]==0){
            counter--;
          }
          l++;
        }
        max = Math.max(window,max);
       }if(counter == 0){
        max --;
       }

       return max;
    }
}