class Solution {
    public int maxLength(int[] nums) {
        int best = 2 , product = 1 , l = 0 ;
        for(int r = 0 ; r< nums.length ;r++){
            int x = nums[r];
            while(gcd(product,x)>1){
            product /= nums[l++];
            }

            product *= x;
           best = Math.max(best , r-l+1);
        }
        return best;
    }
    private int gcd(int a, int b){
        return b == 0 ? a:gcd(b , a % b);
    }
}