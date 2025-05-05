// Last updated: 5/5/2025, 7:50:28 PM
class Solution {
    public int numTilings(int n) {
        long[] dp = new long[n + 3];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 5;

        for (int i = 3; i < n; i++)
            dp[i] = (dp[i - 1] * 2 + dp[i - 3]) % 1000000007;

        return (int) dp[n - 1];
    }
}