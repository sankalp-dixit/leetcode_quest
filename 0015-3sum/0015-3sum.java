class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> L = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
    continue;
}
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
            int s = nums[i] + nums[left] + nums[right];
            if(s == 0){
                List<Integer> l = new ArrayList<>();
                l.add(nums[i]);
                l.add(nums[left]);
                l.add(nums[right]);
                L.add(l);
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
            }
            else if( s > 0)
            right--;
            else
            left++;
        }
        }
        return L;
    }
}