public class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        final int MOD = 1000000007;
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            int[] temp = new int[target + 1];
            for (int j = 1; j <= target; j++) {
                for (int face = 1; face <= k; face++) {
                    if (j >= face) {
                        temp[j] = (temp[j] + dp[j - face]) % MOD;
                    }
                }
            }
            dp = temp;
        }

        return dp[target];
    }
}
