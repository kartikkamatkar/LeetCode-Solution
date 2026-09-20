class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1freq[]= new int [26];
        int s2freq[]= new int [26];
        if(s1.length()>s2.length()){
            return false ;
        }
        for(int i = 0 ;i< s1.length();i++){
            s1freq[s1.charAt(i)-'a']++;
        }
        int winsize = s1.length() ;
        for(int i =0 ;i< s2.length();i++){
            s2freq[s2.charAt(i)-'a']++;
            if(i>=winsize){
                s2freq[s2.charAt(i-winsize)-'a']--;
            }
            if(i>=winsize-1){
                if(Arrays.equals(s1freq,s2freq)){
                    return true ;
                }
            }
        }
        return false ;
    }
}