class Solution {
    public int[] sortedSquares(int[] nums) {
        int l =0;
        int r =nums.length-1;
        int n =nums.length;
        for(int i =0;i<nums.length ;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}