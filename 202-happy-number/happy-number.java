class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = sum(n);
        
        while(fast != 1 && slow != fast){
            slow = sum(slow);
            fast = sum(sum(fast));            
        }
        return fast == 1;
    }
    public int sum( int n){
        int sum = 0;
        while(n != 0){
            int temp = n % 10;
            int sq = temp * temp;   
            sum += sq; 
            n /=10;
        }
        return sum;
    }
}