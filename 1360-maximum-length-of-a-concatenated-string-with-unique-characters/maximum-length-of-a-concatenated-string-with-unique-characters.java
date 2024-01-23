import java.util.List;

public class Solution {
    public int maxLength(List<String> arr) {
        return backtrack(arr, 0, "");
    }

    private int backtrack(List<String> arr, int index, String current) {
        // Check if the current string has duplicate characters
        if (!isUnique(current)) {
            return 0;
        }

        int maxLength = current.length();

        // Explore all possible combinations by considering or skipping the current string
        for (int i = index; i < arr.size(); i++) {
            maxLength = Math.max(maxLength, backtrack(arr, i + 1, current + arr.get(i)));
        }

        return maxLength;
    }

    private boolean isUnique(String s) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            if (count[c - 'a'] > 0) {
                return false; // Duplicate character found
            }
            count[c - 'a']++;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<String> arr1 = List.of("un", "iq", "ue");
        System.out.println(solution.maxLength(arr1)); // Output: 4

        List<String> arr2 = List.of("cha", "r", "act", "ers");
        System.out.println(solution.maxLength(arr2)); // Output: 6

        List<String> arr3 = List.of("abcdefghijklmnopqrstuvwxyz");
        System.out.println(solution.maxLength(arr3)); // Output: 26
    }
}
