class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=  nums.size();
        int minsum = Integer.MAX_VALUE;
        for(int i = l ;i <= r; i++)
        {
            if(l > n){
                break;
            }
            int currsum = 0 ;
            for(int j = 0 ;j < i ;j++){
                currsum += nums.get(j);
            }
            if(currsum > 0){
                minsum = Math.min(minsum, currsum);
            }
            for(int j = i ;j<n;j++){
                currsum += nums.get(j) - nums.get(j - i);
                if(currsum > 0){
                minsum = Math.min(minsum, currsum);
            }
            }
    
        }
        return minsum == Integer.MAX_VALUE?-1:minsum ;
    }
}