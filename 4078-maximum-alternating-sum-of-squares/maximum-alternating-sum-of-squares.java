class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length ;
        long newarr[] = new long  [n];

        for(int i = 0 ;i< nums.length ;i++)
        {
            newarr[i]= nums[i] * nums[i];
        }
        long ans = 0 ;
        
        Arrays.sort(newarr);
        for(int i = 0 ;i< n/2;i++){
            ans -= newarr[i];
        }
        for(int i = n/2;i< n;i++){
            ans+= newarr[i];
        }
        return ans;
    }
}