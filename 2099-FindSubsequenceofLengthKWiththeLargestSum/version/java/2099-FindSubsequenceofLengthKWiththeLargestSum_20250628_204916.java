// Last updated: 6/28/2025, 8:49:16 PM
import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] indexedNums = new int[n][2];  // [value, index]

        for (int i = 0; i < n; i++) {
            indexedNums[i][0] = nums[i];
            indexedNums[i][1] = i;
        }

        // Sort by value in descending order
        Arrays.sort(indexedNums, (a, b) -> Integer.compare(b[0], a[0]));

        // Pick top k elements
        int[][] topK = Arrays.copyOfRange(indexedNums, 0, k);

        // Sort the top k by index to maintain original order
        Arrays.sort(topK, Comparator.comparingInt(a -> a[1]));

        // Extract values
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK[i][0];
        }

        return result;
    }
}
