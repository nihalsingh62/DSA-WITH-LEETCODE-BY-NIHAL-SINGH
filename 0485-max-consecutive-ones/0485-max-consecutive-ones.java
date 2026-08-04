class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        return loopd(nums);
        
    }static int loopd(int[] nums){
        int left = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        while(left!=nums.length){
            if(nums[left] != 0){
                sum += nums[left];
                left++;
            }else if(nums[left] == 0){
                left++;
                sum=0;
            }max = Math.max(sum,max);
        }return max;
    }
}