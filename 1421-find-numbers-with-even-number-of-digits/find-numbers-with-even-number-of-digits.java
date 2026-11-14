class Solution {
    public int findNumbers(int[] nums) {
        int even = 0 ;
        for(int i = 0 ;i < nums.length ;i++){
            if(check(nums[i])%2==0){
                even++;
            }
        }
        return even ;
    }
    private int check( int n){
        int count = 0 ;
        while(n != 0){
            count ++;
            n /=10;
        }return count ;
    }
}