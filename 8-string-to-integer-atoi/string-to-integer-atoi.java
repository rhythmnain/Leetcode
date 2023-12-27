public class Solution {
    public int myAtoi(String s) {
        int index = 0, sign = 1, result = 0;
        int n = s.length();

        // Step 1: Skip leading whitespace
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // Step 2: Check for sign
        if (index < n && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Step 3: Read digits until non-digit character or end of string
        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            // Check for overflow before updating result
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        // Step 4: Apply sign to result
        return result * sign;
    }
}
