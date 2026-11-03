class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int ans = 0 ;
        int n = nums.length-1;
        for(int i = 0 ;i< nums.length ;i++){
            ans += nums[n] - nums[i];
        }
        return ans ;
    }
}