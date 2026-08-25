class Solution {
    public int maxArea(int[] nums) {
        int l =0;
        int r =nums.length-1;
        int ans=0;
        while(l<r){
            int min =Math.min(nums[l],nums[r]);
            int w =r-l;
            int total =min*w;
            ans=Math.max(ans,total);
            if(nums[l]<nums[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return ans ;
    }
}