class Solution {
    public long countCommas(long n) {
       long count = 0;
       long limit = 1000;
        if(n < 1000){
            return 0;
        }       
        else {
            while(n>=limit){
                count +=( n - limit+1);
                if(limit >= Long.MAX_VALUE-1000){
                    break;
                }
                limit*=1000;
            }
        }
        return count ;
    }
}