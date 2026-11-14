class Solution {
    public int[] replaceElements(int[] nums) {
     int rmax = -1 ;
     for(int i = nums.length -1 ;i>= 0 ; i--){
        int curr = nums[i];
        nums[i] = rmax;
        rmax = Math.max(curr, rmax);
     }
     return nums;
    }
}