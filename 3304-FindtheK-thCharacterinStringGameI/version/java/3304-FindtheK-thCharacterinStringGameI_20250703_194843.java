// Last updated: 7/3/2025, 7:48:43 PM
class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                // Get next character with wrap-around
                char nextChar = (char) ((c - 'a' + 1) % 26 + 'a');
                next.append(nextChar);
            }
            word.append(next);
        }

        return word.charAt(k - 1);
    }
}
