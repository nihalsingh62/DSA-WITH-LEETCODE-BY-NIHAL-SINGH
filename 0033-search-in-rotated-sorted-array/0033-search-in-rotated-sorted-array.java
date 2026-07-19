// phle peak nikalo phir left ascending prr binary search lagado as 
//left = 0, right = peak;
//phir after peak ek aur ascending prr lagado peak se
//left = peak+1 to right = length;
// aur index ko return krdo
class Solution {
    public int search(int[] nums, int target) {
        int peak = peakkk(nums);
        
        if(peak == -1){
            return normalbs(nums,target);
        }
        if(nums[peak] == target){
            return peak;
        }
        int ans = lefts(nums,target,peak);
        if(ans != -1){
            return ans;
        }
        return rights(nums,target,peak);
        
    }
    static int peakkk(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(mid < right && nums[mid] > nums[mid+1]){
                return mid;
            }else if(mid > left && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            else if(nums[left] >= nums[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }return -1;
    }
    static int lefts(int[] nums, int target,int peak){
        int left = 0;
        int right = peak;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }return -1;
    }
    static int rights(int[] nums, int target, int peak){
        int left = peak+1;
        int right = nums.length - 1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }return -1;
    }
    static int normalbs(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid+1;
            }
        }return -1;
    }
}