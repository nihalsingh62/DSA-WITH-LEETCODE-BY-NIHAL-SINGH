class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if( msss(target,nums) == Integer.MAX_VALUE ){
            return 0;
        }return msss(target,nums);
        
        
    }static int msss(int target, int[] nums){
        int left = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                min = Math.min(min, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }return min;
    }
}