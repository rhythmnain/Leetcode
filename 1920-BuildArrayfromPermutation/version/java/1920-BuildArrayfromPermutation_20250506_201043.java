// Last updated: 5/6/2025, 8:10:43 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0; i<n; i++){
            result[i]= nums[nums[i]];
        }
        return result;
    }
}