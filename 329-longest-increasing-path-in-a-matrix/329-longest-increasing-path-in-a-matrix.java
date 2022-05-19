class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int[][] memo = new int[matrix.length][matrix[0].length];
        int result = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                result = Math.max(result,findLongest(matrix,row,col,Integer.MIN_VALUE,memo));
            }
        }
        return result;
    }
    public int findLongest(int[][] matrix, int row, int col, int pre, int[][] memo){
        if(row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length || matrix[row][col] <= pre)
            return 0;
    
        if(memo[row][col] > 0){
            return memo[row][col];
        }
        else{
            int curr = matrix[row][col];
            int tempMax = 0;
            tempMax = Math.max(tempMax, findLongest(matrix, row - 1, col, curr, memo));
            tempMax = Math.max(tempMax, findLongest(matrix, row + 1, col, curr, memo));
            tempMax = Math.max(tempMax, findLongest(matrix, row, col - 1, curr, memo));
            tempMax = Math.max(tempMax, findLongest(matrix, row, col + 1, curr, memo));
            memo[row][col] = tempMax + 1;
            return memo[row][col];
        }
    }
}