class Solution {
    public int findTheLongestSubstring(String s) {
     int  freq[] = new int [32];
     for( int i = 0 ;i < 32 ;i++){
        freq[i] = -1;
    }
    freq[0] = 0;
    int mask = 0 ;
    int ans = 0;
    for(int i = 0 ;i < s.length ();i++){
        char ch = s.charAt(i);
        if(ch == 'a'){
            mask ^= 1;
        }
        
        else if(ch == 'e'){
            mask ^= 2;
        }
        else if(ch == 'i'){
            mask ^= 4;
        }
        else if(ch == 'o'){
            mask ^= 8;
        }
        else if(ch == 'u'){
            mask ^= 16;
        }
        if(freq[mask] != -1){
            ans = Math.max(ans, i + 1 - freq[mask]);
        }
        else{
            freq[mask] = i+1;
        }

    }
    return ans ;
  }
}