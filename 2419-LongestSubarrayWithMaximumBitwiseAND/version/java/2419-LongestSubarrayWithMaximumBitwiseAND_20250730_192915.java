// Last updated: 7/30/2025, 7:29:15 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int max =0; 
        int count =0; 
        int maxCount =0;
        for(int i =0; i <n; i++){
            max= Math.max(max,nums[i]);
        }
        for(int i =0; i<n; i++){
            if(max==nums[i]){
                count++;
            } else{
                maxCount = Math.max(maxCount, count);
                count=0;
            }
        }
        maxCount = Math.max(maxCount, count);
        if(maxCount==0){
            return 1;
        }
        return maxCount;
    }
}