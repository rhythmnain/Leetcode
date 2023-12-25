class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }
            if (i > 1 && isValidTwoDigit(s.substring(i - 2, i))) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }

    private boolean isValidTwoDigit(String s) {
        int num = Integer.parseInt(s);
        return num >= 10 && num <= 26;
    }
}
