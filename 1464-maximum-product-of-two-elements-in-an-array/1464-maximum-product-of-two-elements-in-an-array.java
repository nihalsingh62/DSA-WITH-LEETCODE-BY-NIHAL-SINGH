class Solution {
    public int maxProduct(int[] nums) {
        return maxpro(nums);
        
    }static int maxpro(int[] nums){
        Arrays.sort(nums);
        return (nums[nums.length - 1]-1)*(nums[nums.length - 2]-1);
    }
}