/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = index(target, mountainArr);

        int ans = ascen(target, mountainArr, peak);
        if (ans != -1) {
            return ans;
        }

        ans = dscen(target, mountainArr, peak);
        return ans;
    }
    static int index(int target, MountainArray mountainArr){
        int left = 0;
        int right = mountainArr.length() - 1;
        while(left<right){
            int mid = left + (right - left) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                right = mid;
            } 
            else{
                left = mid + 1;
            }
        }return left;
    }static int ascen(int target, MountainArray mountainArr, int ans){
        int left = 0;
        int right = ans;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(mountainArr.get(mid) == target){
                return mid;
            }else if(mountainArr.get(mid) > target) {
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
        }return -1;
    }
    static int dscen(int target, MountainArray mountainArr, int ans){
        int left = ans + 1;
        int right = mountainArr.length() - 1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(mountainArr.get(mid) == target){
                return mid;
            }else if(mountainArr.get(mid) < target) {
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
        }return -1;
    }
}