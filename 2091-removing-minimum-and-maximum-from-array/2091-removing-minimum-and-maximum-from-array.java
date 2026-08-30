class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int imin = 0;
        int imax = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                imin = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                imax = i;
            }
        }

        // Make imin the smaller index
        if (imin > imax) {
            int temp = imin;
            imin = imax;
            imax = temp;
        }

        // Both from left
        int left = imax + 1;

        // Both from right
        int right = n - imin;

        // One from left, one from right
        int both = (imin + 1) + (n - imax);

        return Math.min(left, Math.min(right, both));
    }
}