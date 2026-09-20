class Solution {
    public int reverseDegree(String s) {
        int arr[]= new int [26];
        int sum = 0;
         int val = 0;
        for(int i =0 ;i< s.length();i++){
           val = 26 - (s.charAt(i)-'a');
           sum +=val*(i+1);
        }
        
        return sum ;
    }
}