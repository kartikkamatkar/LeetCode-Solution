class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List <Integer> ans = new ArrayList<>();
        if(s.length()<p.length()){
            return ans ;
        }
        int pfreq[]= new int [26];
        int winfreq[]= new int [26];
        int windowsize = 0;

        for(int i =0 ;i < p.length();i++){
            pfreq[p.charAt(i)-'a']++;
        }
        windowsize = p.length();
        for(int i=0 ;i< s.length();i++){
            //add current 
            winfreq[s.charAt(i)-'a']++;
            //check size  
            if(i>=windowsize)
            {
                winfreq[s.charAt(i-windowsize)-'a']--;
            }
            //check equals 
            if(i>=windowsize-1){
                if(Arrays.equals(pfreq,winfreq)){
                    ans.add(i-windowsize+1);
                }

            }

        }
        return ans ;
    }
}