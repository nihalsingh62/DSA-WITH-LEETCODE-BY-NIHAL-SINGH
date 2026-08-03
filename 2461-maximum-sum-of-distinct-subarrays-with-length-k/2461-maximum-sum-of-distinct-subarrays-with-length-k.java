import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        return sw(nums, k);
    }

    static long sw(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        long max = 0;
        if (map.size() == k) {
            max = sum;
        }

        // Sliding window
        for (int i = k; i < nums.length; i++) {
            int left = nums[i - k];

            // Remove left element
            map.put(left, map.get(left) - 1);
            if (map.get(left) == 0) {
                map.remove(left);
            }
            sum -= left;

            // Add right element
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Update answer
            if (map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}