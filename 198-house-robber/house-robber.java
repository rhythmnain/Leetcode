public class Solution {

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int prev1 = 0;  // Represents the maximum amount that can be robbed excluding the current house
        int prev2 = 0;  // Represents the maximum amount that can be robbed two houses ago

        for (int num : nums) {
            int current = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int result1 = rob(nums1);
        System.out.println("Output 1: " + result1);  // Output: 4

        int[] nums2 = {2, 7, 9, 3, 1};
        int result2 = rob(nums2);
        System.out.println("Output 2: " + result2);  // Output: 12
    }
}