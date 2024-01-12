public class Solution {
    public static boolean halvesAreAlike(String s) {
        int length = s.length();
        String vowels = "aeiouAEIOU";

        // Count vowels in the first half
        int countA = countVowels(s.substring(0, length / 2), vowels);

        // Count vowels in the second half
        int countB = countVowels(s.substring(length / 2), vowels);

        // Check if the counts are equal
        return countA == countB;
    }

    // Helper function to count vowels in a given string
    private static int countVowels(String str, String vowels) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(halvesAreAlike("book"));      // Output: true
        System.out.println(halvesAreAlike("textbook"));  // Output: false
    }
}
