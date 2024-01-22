import java.util.*;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int duplicate = -1, missing = -1;

        for (int num : nums) {
            if (!numSet.add(num)) {
                duplicate = num;
            }
        }

        int expectedSum = (nums.length * (nums.length + 1)) / 2;
        int actualSum = Arrays.stream(nums).sum();

        missing = expectedSum - (actualSum - duplicate);

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 2, 4};
        int[] result1 = solution.findErrorNums(nums1);
        System.out.println(Arrays.toString(result1));  // Output: [2, 3]

        int[] nums2 = {1, 1};
        int[] result2 = solution.findErrorNums(nums2);
        System.out.println(Arrays.toString(result2));  // Output: [1, 2]
    }
}
