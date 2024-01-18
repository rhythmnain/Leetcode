import java.util.*;

public class Solution {

    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of steps (n): ");
        int n = scanner.nextInt();

        int result = climbStairs(n);
        System.out.println("Number of distinct ways to climb to the top: " + result);

        scanner.close();
    }
}
