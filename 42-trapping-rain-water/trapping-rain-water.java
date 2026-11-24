class Solution {
    public int trap(int[] nums) {
        int water = 0;
        int lhigh = 0;
        int rhigh = 0;
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[l] <= nums[r]) {
                {
                    if (nums[l] > lhigh) {
                        lhigh = Math.max(lhigh, nums[l]);
                    }
                    else{
                        water += lhigh - nums[l];
                    }
                    l++;
                }
            }
             else {
                if(nums[r]> rhigh){
                    rhigh = Math.max(rhigh , nums[r]);
                }
                else{
                    water += rhigh - nums[r];
                }
                r--;
            }

        }
        return water;
    }
}