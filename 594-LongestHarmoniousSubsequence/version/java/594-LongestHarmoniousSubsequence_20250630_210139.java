// Last updated: 6/30/2025, 9:01:39 PM
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count the frequency of each number
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;

        // Check for each key if key + 1 exists
        for (int key : freqMap.keySet()) {
            if (freqMap.containsKey(key + 1)) {
                int length = freqMap.get(key) + freqMap.get(key + 1);
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}
