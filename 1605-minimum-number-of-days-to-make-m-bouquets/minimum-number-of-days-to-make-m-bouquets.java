class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        int ans = 0;
        long range = (long) m * k;
        if (bloomDay.length < range) {
            return -1;
        }
        for (int i : bloomDay) {
            l = Math.min(i, l);
            r = Math.max(i, r);
        }
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (cheack(bloomDay, mid, k, m)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public boolean cheack(int[] bloomDay, int mid, int k, int m) {
        int flower = 0;
        int bouquet = 0;
        for (int i : bloomDay) {
            if (i <= mid) {
                flower++;
                if (flower == k) {
                    bouquet++;
                    flower = 0;
                }
            } else {
                flower = 0;
            }

        }
        if (bouquet < m) {
            return false;
        }
        return  true ;
    }
}