class Solution {
    public int reverse(int x) {
        int ans = 0;
        int range1 = Integer.MIN_VALUE;
        int range2 = Integer.MAX_VALUE;
        while (x != 0) {
            int demo = x % 10;
            if (ans > range2/10 || ans < range1/10) {
                return 0;
            }
            ans =ans * 10 + demo ;
            x/=10;

        }
        return ans;
    }
}