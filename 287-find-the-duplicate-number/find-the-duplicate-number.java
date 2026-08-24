class Solution {
    public int findDuplicate(int[] nums) {
        // int slow = nums[0];
        // int fast = nums[0];
        // do {
        //     slow = nums[slow] - 1;
        //     fast = nums[nums[fast]] - 1;

        //     if(slow == fast)
        //         return slow;
        // }
        // while(slow != fast);

        // return slow;

        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] < 0)
                return index+1;

            nums[index] = -nums[index];
        }

        return -1;
    }
}