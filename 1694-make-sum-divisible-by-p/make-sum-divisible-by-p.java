import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {

        long total = 0;

        for (int i : nums) {
            total += i;
        }

        int target = (int) (total % p);

        if (target == 0) {
            return 0;
        }

        int ans = nums.length;
        long prefixsum = 0;

        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);

        for (int i = 0; i < nums.length; i++) {

            prefixsum = (prefixsum + nums[i]) % p;

            long current = prefixsum;

            long required = (current - target + p) % p;

            if (map.containsKey(required)) {

                int len = i - map.get(required);

                ans = Math.min(ans, len);
            }

            map.put(current, i);
        }

        return ans == nums.length ? -1 : ans;
    }
}