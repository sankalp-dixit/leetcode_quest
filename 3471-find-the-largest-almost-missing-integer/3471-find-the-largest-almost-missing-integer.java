class Solution {
    public int largestInteger(int[] nums, int k) {

        // Every element forms its own subarray
        if(k == 1) {
            int ans = -1;

            for(int i = 0; i < nums.length; i++) {
                int count = 0;

                for(int j = 0; j < nums.length; j++) {
                    if(nums[i] == nums[j])
                        count++;
                }

                if(count == 1)
                    ans = Math.max(ans, nums[i]);
            }

            return ans;
        }

        // Only one subarray: the whole array
        if(k == nums.length) {
            int ans = -1;

            for(int x : nums)
                ans = Math.max(ans, x);

            return ans;
        }

        int c0 = 0;
        int cl = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[0])
                c0++;

            if(nums[i] == nums[nums.length - 1])
                cl++;
        }

        if(c0 == 1 && cl == 1)
            return Math.max(nums[0], nums[nums.length - 1]);
        else if(c0 == 1)
            return nums[0];
        else if(cl == 1)
            return nums[nums.length - 1];
        else
            return -1;
    }
}