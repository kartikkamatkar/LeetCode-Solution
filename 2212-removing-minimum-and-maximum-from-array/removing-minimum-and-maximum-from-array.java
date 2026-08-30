class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minptr = -1, maxptr = -1;

        for(int i = 0; i < nums.length; i++){
            if(min > nums[i]){
                minptr = i;
                min = nums[i];
            }
            if(max < nums[i]){
                maxptr = i;
                max = nums[i];
            }
        }

        int leftdelete = Math.max(minptr,maxptr) + 1;
        int rightdelete = n - Math.min(minptr,maxptr);
        int bothdelete = n - (Math.abs(minptr - maxptr) - 1);

        return Math.min(leftdelete, Math.min(rightdelete,bothdelete));
    }
}