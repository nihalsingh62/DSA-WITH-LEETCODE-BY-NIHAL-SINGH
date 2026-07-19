class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int ans = duplicates(nums);
        if(ans != -1){
            return nums[ans];
        }
        return nums[0];

// 2,2,2,9,0,1,2        
    }static int duplicates(int[] nums){
        int left =  0;
        int right = nums.length -1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(mid < right && nums[mid] > nums[mid + 1] ){
                return mid + 1;
            }else if(left < mid && nums[mid] < nums[mid-1]){
                return mid;
            }else if(nums[mid] == nums[left] && nums[mid] == nums[right]){
                if(left < mid && nums[left] > nums[left+1]){
                    return left + 1;
                }
                left++;
                if(right > left && nums[right] < nums[right - 1]){
                    return right;
                }
                right--; // 2,2,9,0,1,
            }else if(nums[left] < nums[mid] || (nums[left] == nums[mid] && nums[mid] > nums[right]) ){
                left = mid + 1;
            }else{
                right = mid;
            }
        }return -1;
    }
}