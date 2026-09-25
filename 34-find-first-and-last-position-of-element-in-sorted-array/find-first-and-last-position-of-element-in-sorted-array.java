class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstidx = firstCheck(nums,target);
        int lastidx = lastCheck(nums,target);
        return new int[] {firstidx,lastidx};
    }
    public int firstCheck(int nums[], int target){
        int l = 0 ;
        int r = nums.length-1;
        int index = -1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                index = mid;
                r = mid -1;
            }
            else if (nums[mid] > target ){
                r = mid -1;
            }
            else {
                l = mid +1;
              }
               
        
        }
         return index;

    }
    public int lastCheck(int nums[], int target){
        int l = 0 ;
        int r = nums.length -1;
        int index = -1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                index = mid ;
                l = mid +1 ;
            }
            else if (nums[mid] < target ){
                l = mid + 1 ;
            }
            else {
               r = mid - 1;
              }
                
    }
    return index;
}
}