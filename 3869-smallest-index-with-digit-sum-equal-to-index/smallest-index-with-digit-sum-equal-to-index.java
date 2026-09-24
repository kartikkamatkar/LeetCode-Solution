class Solution {
    public int smallestIndex(int[] nums) {
        for( int i = 0;i< nums.length;i++)
        {
            if(check(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
    public int check(int val ){
        int ans = 0;
        while(val!= 0){
            ans += val % 10;
            val /=10;
        }
        return ans ;

    }
}