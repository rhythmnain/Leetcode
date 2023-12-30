import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character in the array of strings
        for (String word : words) {
            for (char c : word.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        // Check if the count of each character is a multiple of the number of words
        int wordCount = words.length;
        for (int count : charCount.values()) {
            if (count % wordCount != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words1 = {"abc", "aabc", "bc"};
        System.out.println(solution.makeEqual(words1)); // Output: true

        String[] words2 = {"ab", "a"};
        System.out.println(solution.makeEqual(words2)); // Output: false
    }
}
