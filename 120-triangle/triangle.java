public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        // Use an array to store the minimum path sum for each position
        int[] dp = new int[n];
        
        // Initialize dp array with the last row of the triangle
        List<Integer> lastRow = triangle.get(n - 1);
        for (int i = 0; i < n; i++) {
            dp[i] = lastRow.get(i);
        }
        
        // Traverse the triangle from bottom to top
        for (int row = n - 2; row >= 0; row--) {
            List<Integer> currentRow = triangle.get(row);
            for (int col = 0; col < currentRow.size(); col++) {
                // Update dp array with the minimum path sum for each position
                dp[col] = currentRow.get(col) + Math.min(dp[col], dp[col + 1]);
            }
        }
        
        // The first element of dp array will contain the minimum path sum from top to bottom
        return dp[0];
    }
}