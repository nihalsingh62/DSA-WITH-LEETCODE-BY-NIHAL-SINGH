class Solution {
    public int splitArray(int[] nums, int k) {
        int mini = minsum(nums);
        int maxi = maxsum(nums);
        int ans = bs(nums,mini ,maxi,k);
        return ans;

        
    }static int maxsum(int[] nums){
        int maxsumm = 0;
        for(int i = 0; i< nums.length;i++){
            maxsumm += nums[i];
        }return maxsumm;
    }static int minsum(int[] nums){
        int minsumm = Integer.MIN_VALUE;
        for(int i = 0 ; i< nums.length;i++){
            minsumm = Math.max(minsumm, nums[i]);
        }return minsumm;
    }static int bs(int[] nums,int left ,int right , int k){

        while(left<right){
            int mid = left + (right - left ) / 2;
            int pieces = 1;
            int sum = 0;
            for(int i = 0; i < nums.length;i++){
                if(sum + nums[i] > mid){
                    pieces++;
                    sum = nums[i];
                }else{
                    sum += nums[i];
                }
            }if(pieces>k){
                left = mid + 1;
            }else{
                right = mid;
            }
        }return right;
    }

}