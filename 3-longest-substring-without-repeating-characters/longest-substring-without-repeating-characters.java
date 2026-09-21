class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        int l =0 ;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            //find dublicate 
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            //add the element in the window 
            set.add(s.charAt(i));

            max =Math.max(max,i-l+1);

        }
        return max;
    }
}