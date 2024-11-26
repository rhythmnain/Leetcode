import java.util.HashMap;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Create a HashMap to store the count of each value
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each value
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Create a HashSet to store unique counts
        HashSet<Integer> uniqueCounts = new HashSet<>(countMap.values());

        // If the size of the uniqueCounts set is equal to the size of the countMap, return true
        return uniqueCounts.size() == countMap.size();
    }
}