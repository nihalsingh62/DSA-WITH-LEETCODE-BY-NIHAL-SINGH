class Solution {

    public void nextPermutation(int[] nums) {

        // Case 1: Entire array is in descending order
        if (reverseIfDescending(nums)) {
            return;
        }

        // Find pivot
        int pivot = findPivot(nums);

        // Swap with next greater element
        interchange(nums, pivot);

        // Reverse the suffix
        rearrange(nums, pivot);
    }

    static boolean reverseIfDescending(int[] nums) {

        boolean descending = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                descending = false;
                break;
            }
        }

        if (descending) {

            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }

        return descending;
    }

    static int findPivot(int[] nums) {

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                return i;
            }
        }

        return -1;
    }

    static void interchange(int[] nums, int pivot) {

        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {

                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;

                return;
            }
        }
    }

    static void rearrange(int[] nums, int pivot) {

        int left = pivot + 1;
        int right = nums.length - 1;

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}