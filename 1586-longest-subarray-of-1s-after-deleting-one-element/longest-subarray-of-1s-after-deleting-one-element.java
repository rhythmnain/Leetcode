class Solution {
    public int longestSubarray(int[] nums) {
        int lastZeroIndex = 0, start=0, end=0, ans = 0;
        boolean deleted = false;

    for (end = 0; end < nums.length; end++) {
      if (nums[end] == 0) {
        if (!deleted) {
          deleted = true;
        } else {
        // subtract one because index of 0 is deleted from the window.
          ans = Math.max(ans, end - start - 1);
          start = lastZeroIndex + 1;
        }
        lastZeroIndex = end;
      }
    }
        //when loop ends we haven't calculated `ans` for latest window
        if (deleted) {
         ans = Math.max(ans, end - start - 1);
        } 
        else{ // in case we had all 1.
        //subtract 1 because after loop ends `end` will be out of nums length.
           ans = end - start - 1;
        }
        return ans;
    }
}