class Solution {
    public int findMin(int[] nums) {
        int ans = peakkk(nums);
        if(ans != -1){
            return nums[ans];
        }else{
            return nums[0];
        }
        
    }static int peakkk(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(mid < right && nums[mid] > nums[mid + 1]){
                return mid+1;
            }else if(mid > left && nums[mid] < nums[mid - 1] ){
                return mid;
            }
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }return -1;
    }
    
}