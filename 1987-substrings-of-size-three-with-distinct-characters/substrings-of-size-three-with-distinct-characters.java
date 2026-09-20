class Solution {
    public int countGoodSubstrings(String s) {
        int l = 0;
        int count = 0;
        for (int r = 0; r < s.length(); r++) {
            if (r >= 2) {
                if (s.charAt(r) != s.charAt(r - 1) && s.charAt(r) != s.charAt(r - 2)
                        && s.charAt(r - 1) != s.charAt(r - 2)) {
                            count++;
                }

            }

        }
        return count;

    }

}