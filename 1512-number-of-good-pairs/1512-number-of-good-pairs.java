class Solution {
    public int numIdenticalPairs(int[] nums) {
        return goodpairs(nums);
        
    }static int goodpairs(int[] nums){
        int left = 0;
        int right = 1;
        int count = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[i] == nums[j] && i < j){
                    count++;
                }
            }
        }return count;
    }
}