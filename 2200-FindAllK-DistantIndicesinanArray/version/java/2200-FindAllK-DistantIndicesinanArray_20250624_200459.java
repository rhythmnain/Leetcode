// Last updated: 6/24/2025, 8:04:59 PM
import java.util.*;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        // Step 1: Identify all indices where nums[i] == key
        List<Integer> keyIndices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                keyIndices.add(i);
            }
        }

        // Step 2: Use a boolean array to mark k-distant indices
        boolean[] isKDist = new boolean[n];
        for (int index : keyIndices) {
            int start = Math.max(0, index - k);
            int end = Math.min(n - 1, index + k);
            for (int i = start; i <= end; i++) {
                isKDist[i] = true;
            }
        }

        // Step 3: Collect the marked indices into the result list
        for (int i = 0; i < n; i++) {
            if (isKDist[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
