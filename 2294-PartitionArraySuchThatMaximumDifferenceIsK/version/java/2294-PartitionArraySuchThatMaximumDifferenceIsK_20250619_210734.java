// Last updated: 6/19/2025, 9:07:34 PM
import java.util.Arrays;

class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);  // Sort the array
        int count = 1;       // At least one group is needed
        int start = nums[0]; // Start of current group
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - start > k) {
                count++;        // Need a new group
                start = nums[i]; // Reset start of the new group
            }
        }
        
        return count;
    }
}
