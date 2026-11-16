class Solution {
    public String digitSum(String s, int k) {
        // Keep compressing until the string length is k or less
        while (s.length() > k) {
            StringBuilder nextRound = new StringBuilder();
            
            // Step through the string in chunks of size k
            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;
                int end = Math.min(i + k, s.length());
                
                // Sum the digits in the current chunk
                for (int j = i; j < end; j++) {
                    sum += s.charAt(j) - '0';
                }
                
                nextRound.append(sum);
            }
            
            // Update s for the next round
            s = nextRound.toString();
        }
        
        return s;
    }
}
