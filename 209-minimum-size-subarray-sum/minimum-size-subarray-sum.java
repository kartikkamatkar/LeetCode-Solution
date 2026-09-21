class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int minlength = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            //expand the window 
            sum += nums[i];

            //shrink the window 
            while (sum >= target) {
                minlength = Math.min(minlength, i - l + 1);
                sum -= nums[l];
                l++;
            }

        }
        return minlength == Integer.MAX_VALUE ? 0 :minlength ;
    }
}