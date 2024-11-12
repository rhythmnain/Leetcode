import java.util.*;

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        // Step 1: Sort items by price and then by beauty in descending order
        Arrays.sort(items, (a, b) -> a[0] - b[0]); // Sort by price (ascending)
        
        // Step 2: Precompute the maximum beauty for each price
        int n = items.length;
        int[] maxBeauty = new int[n];
        maxBeauty[0] = items[0][1]; // first item's beauty is its own beauty
        for (int i = 1; i < n; i++) {
            maxBeauty[i] = Math.max(maxBeauty[i - 1], items[i][1]); // track the max beauty so far
        }

        // Step 3: Answer the queries using binary search
        int m = queries.length;
        int[] result = new int[m];
        
        // Use binary search for each query
        for (int i = 0; i < m; i++) {
            int query = queries[i];
            int left = 0, right = n - 1;
            int bestBeauty = 0; // Default if no items are affordable
            
            // Perform binary search to find the right position for the query price
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (items[mid][0] <= query) {
                    bestBeauty = maxBeauty[mid]; // If this item is affordable, record the max beauty
                    left = mid + 1; // Continue searching for a potentially higher price
                } else {
                    right = mid - 1; // Look for cheaper items
                }
            }
            
            result[i] = bestBeauty; // Store the result for this query
        }
        
        return result;
    }
}
