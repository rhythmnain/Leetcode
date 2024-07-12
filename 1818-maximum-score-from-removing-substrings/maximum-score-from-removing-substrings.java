class Solution {

    public int maximumGain(String s, int x, int y) {
        // Ensure "ab" always has higher points than "ba"
        if (x < y) {
            // Swap points
            int temp = x;
            x = y;
            y = temp;
            // Reverse the string to maintain logic
            s = new StringBuilder(s).reverse().toString();
        }

        int aCount = 0, bCount = 0, totalPoints = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == 'a') {
                aCount++;
            } else if (currentChar == 'b') {
                if (aCount > 0) {
                    // Can form "ab", remove it and add points
                    aCount--;
                    totalPoints += x;
                } else {
                    // Can't form "ab", keep 'b' for potential future 'ba'
                    bCount++;
                }
            } else {
                // Non 'a' or 'b' character encountered
                // Calculate points for any remaining 'ba' pairs
                totalPoints += Math.min(bCount, aCount) * y;
                // Reset counters for next segment
                aCount = bCount = 0;
            }
        }

        // Calculate points for any remaining "ba" pairs at the end
        totalPoints += Math.min(bCount, aCount) * y;

        return totalPoints;
    }
}
// class Solution {
//     public int maximumGain(String s, int x, int y) {
//         int res = 0;
//         String top, bot;
//         int top_score, bot_score;

//         if (y > x) {
//             top = "ba";
//             top_score = y;
//             bot = "ab";
//             bot_score = x;
//         } else {
//             top = "ab";
//             top_score = x;
//             bot = "ba";
//             bot_score = y;
//         }

//         // Removing first top substrings cause they give more points
//         StringBuilder stack = new StringBuilder();
//         for (char ch : s.toCharArray()) { // Changed 'char' to 'ch'
//             if (ch == top.charAt(1) && stack.length() > 0 && stack.charAt(stack.length() - 1) == top.charAt(0)) {
//                 res += top_score;
//                 stack.setLength(stack.length() - 1);
//             } else {
//                 stack.append(ch);
//             }
//         }

//         // Removing bot substrings cause they give less or equal amount of scores
//         StringBuilder new_stack = new StringBuilder();
//         for (char ch : stack.toString().toCharArray()) { // Changed 'char' to 'ch'
//             if (ch == bot.charAt(1) && new_stack.length() > 0 && new_stack.charAt(new_stack.length() - 1) == bot.charAt(0)) {
//                 res += bot_score;
//                 new_stack.setLength(new_stack.length() - 1);
//             } else {
//                 new_stack.append(ch);
//             }
//         }

//         return res;
//     }
// }