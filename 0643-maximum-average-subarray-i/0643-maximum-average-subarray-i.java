class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == k){
            return lawra(nums,k);
        }return sw(nums,k);
        
    }static double sw(int[] nums, int k){
        double maxav = Double.MAX_VALUE;
        double avg = 0;
        for(int i = 0; i<k;i++){
            avg += nums[i];
        }
        
        maxav = avg;
        for(int i= k ; i<nums.length;i++){
            avg = avg - nums[i-k];
            avg = avg + nums[i];
            maxav = Math.max(maxav, avg);
        }return maxav/k;
    }
    
    
    static double lawra(int[] nums , int k){
        double avg = 0;
        for(int i = 0 ; i < k ; i++){
            avg+=nums[i];
        }return avg/k;
    }
}