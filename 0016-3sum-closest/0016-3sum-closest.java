class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
    continue;
}
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
            int s = nums[i] + nums[left] + nums[right];
            if(Math.abs(s - target) < min){
                min = Math.abs(s - target);
                ans = s;
                
            }
           if(s == target)
           return s;
            else if( target > s)
            left++;
            else
            right--;
        }
        }
        return ans;
    }
}