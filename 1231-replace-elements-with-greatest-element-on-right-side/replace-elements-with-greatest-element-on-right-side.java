class Solution {
    public int[] replaceElements(int[] nums) {
        
        int k = 0 ;
        for(int i = 0 ; i < nums.length-1 ; i++){
            int max = 0 ;
            for(int j = i+1 ;j < nums.length ; j++){
                max = Math.max (nums[j],max);
            }
            nums[k] = max;
            k++;
        }
        nums[k] = -1;
        return nums;
    }
}