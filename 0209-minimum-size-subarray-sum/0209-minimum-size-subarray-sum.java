class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int x = msss(target,nums);
        if( x == Integer.MAX_VALUE ){
            return 0;
        }return x;
        
        
    }static int msss(int target, int[] nums){
        int sum = 0;
        int left = 0;
        int len = 0;
        int min = Integer.MAX_VALUE;

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