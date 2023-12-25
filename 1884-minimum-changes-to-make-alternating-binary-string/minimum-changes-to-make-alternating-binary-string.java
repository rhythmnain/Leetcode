class Solution {
    public int minOperations(String s) {
        return Math.min(getOperations(s, '0'), getOperations(s, '1'));
    }

    private int getOperations(String s, char startChar) {
        int operations = 0;

        for (int i = 0; i < s.length(); i++) {
            char expectedChar = (i % 2 == 0) ? startChar : flip(startChar);
            if (s.charAt(i) != expectedChar) {
                operations++;
            }
        }

        return operations;
    }

    private char flip(char c) {
        return (c == '0') ? '1' : '0';
    }
}
