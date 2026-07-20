class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        float[] avg = firstt(nums);
        return avgcal(avg);
        
    }static float[] firstt(int[] nums){
        float[] avg = new float[nums.length / 2];
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            float maxavge = (nums[left] + nums[right]) / 2.0f;
            avg[left] = maxavge;
            left++;
            right--;
        }return avg;
    }static float avgcal(float[] avg){
        float ans = Integer.MAX_VALUE;
        for(int i = 0; i<avg.length;i++){
            ans = Math.min(ans,avg[i]);
        }return ans;
    }
}