// Last updated: 7/27/2025, 12:38:11 PM
class Solution {
    public int countHillValley(int[] nums) {
        int count =0;
        int j =0;
        int n= nums.length;

        for(int i =1; i<n-1; i++){
            if((nums[j]<nums[i] && nums[i]>nums[i+1]) || (nums[j]>nums[i] && nums[i] <nums[i+1])){
                count++;
                j=i;
            }
        }
        return count;
    }
}