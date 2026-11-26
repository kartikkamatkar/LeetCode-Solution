class Solution {
    public boolean canAliceWin(int n) {
        boolean alicewin = true ;
        int stonetoremove = 10;
        while(n >= stonetoremove){
            n -= stonetoremove;
            stonetoremove --;
            alicewin = !alicewin; 
        }
        return !alicewin;
    }
}