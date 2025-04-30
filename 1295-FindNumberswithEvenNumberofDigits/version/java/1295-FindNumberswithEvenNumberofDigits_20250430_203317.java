// Last updated: 4/30/2025, 8:33:17 PM
class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;

        for (int n : nums) {
            if ((n > 9 && n < 100) || (n > 999 && n < 10000) || n == 100000) {
                res++;
            }
        }

        return res;        
    }
}