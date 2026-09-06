class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l =0 ;
        int wsum =0;
        for(int i =0 ;i<k;i++){
            wsum +=nums[i];
        }
        int max =wsum;
        for( int r =k;r< nums.length ;r++){
            wsum +=nums[r];
            wsum-=nums[r-k];
            max=Math.max(wsum,max);
        }
        return (double) max/k;
    }
}