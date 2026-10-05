class Solution {
    public int numOfSubarrays(int[] arr) {
        long ans = 0 ;
        int even = 1;
        int odd = 0 ;
        int prefixsum = 0 ;
        for(int i : arr){
            prefixsum = (prefixsum + i)%2;
            if(prefixsum == 1){
                ans += even ;
                odd++;
            }
            else{
            ans +=odd ;
            even ++;
            }

        }
        return (int)(ans % 1000000007);
    }
}