class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;

        int[] ans = new int[m * n];
        int k = 0;

        for (int sum = 0; sum <= m + n - 2; sum++) {

            if (sum % 2 == 0) {

                // reverse direction
                for (int row = Math.min(sum, m - 1); row >= 0; row--) {
                    int col = sum - row;

                    if (col >= 0 && col < n) {
                        ans[k++] = mat[row][col];
                    }
                }

            } else {

                // normal direction
                for (int row = 0; row <= Math.min(sum, m - 1); row++) {
                    int col = sum - row;

                    if (col >= 0 && col < n) {
                        ans[k++] = mat[row][col];
                    }
                }
            }
        }

        return ans;
    }
}