class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;

        while (even < nums.length && odd < nums.length) {

            // Move even pointer until it finds a wrong element
            while (even < nums.length && nums[even] % 2 == 0) {
                even += 2;
            }

            // Move odd pointer until it finds a wrong element
            while (odd < nums.length && nums[odd] % 2 == 1) {
                odd += 2;
            }

            // If both pointers are within the array, swap
            if (even < nums.length && odd < nums.length) {
                swap(nums, even, odd);
            }
        }

        return nums;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}