class Solution {
    public int maximumDifference(int[] nums) {
        int diff = 0;
        int max = -1 ;
        for(int i = 0 ; i< nums.length ; i++){
           for(int j = i; j < nums.length ;j++){
            diff = nums[j] - nums[i];
            if(diff > 0)
            {
                max = Math.max (diff , max);

            }
           }
        }
        return max ;
           
    }
}