class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suffix = new int[n];
        suffix[n - 1] = nums[n - 1];

        // Precompute the minimum value for every suffix
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.min(nums[i], suffix[i + 1]);
        }

        // Maintain the running maximum of the prefix and check the condition
        int l = 0;
        for (int i = 0; i < n; i++) {
            l = Math.max(l, nums[i]);
            if (l - suffix[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}