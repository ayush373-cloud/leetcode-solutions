class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1)
            return x;

        int l = 1, r = x, ans = 0;

        while (l <= r) {

            int m = l + (r - l) / 2;

            long sq = (long) m * m;

            if (sq == x)
                return m;

            if (sq < x) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }
}