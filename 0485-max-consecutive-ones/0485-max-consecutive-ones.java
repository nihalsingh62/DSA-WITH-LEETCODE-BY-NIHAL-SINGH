class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        return h(nums);
        
    }static int h(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0; i<nums.length ; i++ ){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max = Math.max(max,map.getOrDefault(1,0));
            if(nums[i] == 0){
                map.clear();
            }
        }return max;
    }
}