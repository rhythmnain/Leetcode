// Last updated: 4/27/2025, 9:57:04 PM
class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 0; i + 2 < nums.length; i++) {
            if (2 * (nums[i] + nums[i + 2]) == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }
}