class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = k;
        int m = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % k == 0 && nums[i] / k == m ){
            ans += k;
            m++;
            }
            else
            continue;
        }
        return ans;
    }
}