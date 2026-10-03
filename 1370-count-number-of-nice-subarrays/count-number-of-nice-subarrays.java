class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0 ;
        int currsum = 0 ;
        int count = 0 ;
        int oddlen = 0;
        int mid = 0 ;
        for(int i = 0 ;i<nums.length ;i++){
            if(nums[i]%2 != 0){
                oddlen ++;
            }
            while(oddlen > k){
                if(nums[left]%2!= 0){
                    oddlen--;
                }
                left++;
                mid = left ; 
            }
            if(oddlen == k){
                while(mid <= i && nums[mid] % 2 == 0){
                    mid++;
                }
                count +=(mid-left+1);
            }
            
        }
        return count;
    }
}