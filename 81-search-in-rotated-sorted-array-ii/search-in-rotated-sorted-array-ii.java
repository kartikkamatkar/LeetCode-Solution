class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while(l <= r){
            int m = l + ( r - l ) / 2;

            if(nums[m] == target)
                return true;

            if(nums[l] == nums[m] && nums[l] == nums[r]){
                l++;
                r--;
            }
            else{
                //right half is sorted
                if(nums[m] <= nums[r]){ 
                    if(target > nums[m] && target <= nums[r])
                        l = m + 1;
                    else
                        r = m - 1;
                }
                //left half is sorted
                else {      
                    if(target >= nums[l] && target < nums[m])
                        r = m - 1;
                    else
                        l = m + 1;
                }
            }
        }

        return false;
    }
}