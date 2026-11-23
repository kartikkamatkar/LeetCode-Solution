class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        Arrays.sort(nums);
        int maxlen = 1 ;
        int currlen = 1 ;
        for(int i = 1 ; i < nums.length ;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            else if(nums[i] == nums[i-1]+1){
                currlen++;
            }
            else{
            maxlen = Math.max(maxlen, currlen);
            currlen = 1;
            }
        }
        return Math.max(currlen , maxlen);
    }
}