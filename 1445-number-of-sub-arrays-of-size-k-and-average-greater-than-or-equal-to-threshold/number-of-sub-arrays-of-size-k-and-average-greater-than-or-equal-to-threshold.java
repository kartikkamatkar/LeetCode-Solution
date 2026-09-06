class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
      int avg = 0;
      int wsum =0;
      for( int i =0 ;i<k;i++){
            wsum +=nums[i];
      }  
       int count =0;
       if(wsum/k>=threshold){
            count++;
        }
     
      for(int i=k;i<nums.length ;i++){
        wsum +=nums[i];
        wsum -=nums[i-k];
        if(wsum/k>=threshold){
            count++;
        }
      }
      return count ;
    }
}