class Solution {
    public int characterReplacement(String s, int k) {
       int l = 0 ,maxcount = 0 ;
       int maxlength = 0;
       int count [] = new int [26];
       for(int r = 0;r <s.length();r++ ){
        count[s.charAt(r)-'A']++;
        maxcount = Math.max(maxcount, count[s.charAt(r)-'A']);
        if((r - l + 1) -maxcount > k){
            count[s.charAt(l)-'A']--;
            l++;
        }
        maxlength =Math.max(maxlength,r-l+1);


       }
       return maxlength ;
    }
}