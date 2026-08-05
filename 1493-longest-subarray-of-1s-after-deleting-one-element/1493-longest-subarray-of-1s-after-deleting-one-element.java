class Solution {
    public int longestSubarray(int[] nums) {
        return sw(nums);
        
    }static int sw(int[] nums){
        int left = 0;
        int zrocount = 0;
        int maxken = 0;
        for(int right = 0; right<nums.length;right++){
            if(nums[right] == 0){
                zrocount++;
            }while(zrocount>1){
                if(nums[left] == 0){
                    zrocount--;
                }
                left++;
            }maxken = Math.max(maxken,right-left);
        }return maxken;
    }
}