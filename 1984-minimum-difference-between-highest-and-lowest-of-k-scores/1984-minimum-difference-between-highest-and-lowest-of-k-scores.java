class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length == 1){
            return 0;
        }return max(nums,k);
        
    }static int max(int[] nums, int k){
        Arrays.sort(nums);
        int ans = nums[k-1] - nums[0];

        for(int i = k;i<nums.length;i++){
            int pans = nums[i] - nums[i-k+1];
            ans= Math.min(ans,pans); 
            
        }return ans;
    }
}