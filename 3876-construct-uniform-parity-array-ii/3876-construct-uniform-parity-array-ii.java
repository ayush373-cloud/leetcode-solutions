class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0];

        // Find minimum element
        for (int x : nums1) {
            min = Math.min(min, x);
        }

        // If minimum is odd, we can make every element odd
        if (min % 2 == 1) {
            return true;
        }

        // Minimum is even.
        // Then every element must already be even.
        for (int x : nums1) {
            if (x % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}