class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[] ans = new int[m * n];
        int k = 0;

        for (int sum = 0; sum < m + n - 1; sum++) {

            int start = Math.min(sum, m - 1);
            int end = Math.max(0, sum - n + 1);

            if (sum % 2 == 0) {
                for (int row = start; row >= end; row--) {
                    ans[k++] = mat[row][sum - row];
                }
            } else {
                for (int row = end; row <= start; row++) {
                    ans[k++] = mat[row][sum - row];
                }
            }
        }

        return ans;
    }
}