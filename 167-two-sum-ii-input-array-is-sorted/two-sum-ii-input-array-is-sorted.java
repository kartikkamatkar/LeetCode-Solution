class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l =0;
        int r =nums.length-1;
        while(l<r){
            int ans =nums[l]+nums[r];
            if(ans==target){
                return new int[]{l+1,r+1};
            }
            else if(ans<target){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[]{-1,-1};
    }
}