class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return s(matrix,target);
        
    }static boolean s(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            int current = matrix[row][col];
            if(current > target){
                col--;
            }else if(current < target){
                row++;
            }else{
                return true;
            }
        }return false;


    }
}