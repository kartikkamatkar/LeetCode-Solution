class Solution {
    public int removeDuplicates(int[] nums) {
        int left =2;
        for(int r =2;r<nums.length;r++){
            if(nums[r]!=nums[left-2]){
                nums[left]=nums[r];
                left++;
            }
        }
        return left ;
    }
}