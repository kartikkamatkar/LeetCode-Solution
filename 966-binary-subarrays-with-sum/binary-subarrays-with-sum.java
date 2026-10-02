class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      return check(nums,goal ) - check(nums, goal -1);
    }
    public int check(int nums[], int maxgoal){
        int currsum = 0, l = 0 , count = 0;
        if(maxgoal < 0){
            return 0;
        }
        for(int i = 0 ;i < nums.length ; i++ ){
            currsum += nums[i];
            while(currsum > maxgoal){
                currsum-=nums[l];
                l++;
            }
            count +=(i-l+1);
        }
        return count;

    }
}