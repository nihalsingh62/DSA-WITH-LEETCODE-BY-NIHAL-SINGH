import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {

        // Step 1: Sort the array
        Arrays.sort(nums);

        int count = 0;
        int n = nums.length;

        // Step 2: Fix the largest side
        for (int k = n - 1; k >= 2; k--) {

            int left = 0;
            int right = k - 1;

            // Step 3: Use two pointers
            while (left < right) {

                if (nums[left] + nums[right] > nums[k]) {

                    // All elements between left and right
                    // with nums[right] will also satisfy
                    count += (right - left);

                    right--;
                } else {

                    // Need a larger sum
                    left++;
                }
            }
        }

        return count;
    }
}