class Solution {
    public int countNegatives(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int row = 0; row < rows; row++) {

            int left = 0;
            int right = cols - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (grid[row][mid] < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // left is the index of the first negative
            count += cols - left;
        }

        return count;
    }
}