class Solution {
    public int[] plusOne(int[] digits) {
        return r(digits);   
    
    }static int[] r(int[] nums){
        if(nums[nums.length -1]  != 9){
            nums[nums.length -1] = nums[nums.length -1] + 1;
        }else{
            return d(nums);
        }
        return nums;
    }static int[] d(int[] nums){
        int count = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == 9){
                count++;
            }
        }if(count == nums.length){
            return n(nums);
        }return hf(nums);
    
    }static int[] n(int[] nums){
        int[] arr = new int[nums.length + 1];
        arr[0] = 1;
        for(int i = arr.length - 1; i>=1;i--){
            arr[i] = 0;
        }return arr;

    }static int[] hf(int[] nums){
        for(int i = nums.length - 1; i>=0;i--){
            if(nums[i] != 9){
                nums[i] = nums[i] + 1;
                break;
            }nums[i] = 0;
        }return nums;
    }
}