class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Initialize a DP array to store the minimum falling path sum for each cell
        int[][] dp = new int[rows][cols];

        // Copy the first row of the matrix to the DP array
        for (int col = 0; col < cols; col++) {
            dp[0][col] = matrix[0][col];
        }

        // Iterate over the remaining rows
        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Find the minimum falling path sum for the current cell
                dp[row][col] = matrix[row][col] + getMin(dp, row - 1, col, cols);
            }
        }

        // Find the minimum falling path sum in the last row
        int minSum = Integer.MAX_VALUE;
        for (int col = 0; col < cols; col++) {
            minSum = Math.min(minSum, dp[rows - 1][col]);
        }

        return minSum;
    }

    // Helper function to get the minimum falling path sum for the cell above the current cell
    private int getMin(int[][] dp, int row, int col, int cols) {
        int minSum = dp[row][col];

        if (col > 0) {
            minSum = Math.min(minSum, dp[row][col - 1]);
        }

        if (col < cols - 1) {
            minSum = Math.min(minSum, dp[row][col + 1]);
        }

        return minSum;
    }
}
