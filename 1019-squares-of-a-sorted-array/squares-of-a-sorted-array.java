class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int n = nums.length;
        if (n % 2 != 0) {
            int mid = n / 2;
            nums[mid] = nums[mid] * nums[mid];
        }
        while (l < r) {
            nums[l] = nums[l] * nums[l];
            nums[r] = nums[r] * nums[r];

            l++;
            r--;
        }
        Arrays.sort(nums);
        return nums;
    }
}