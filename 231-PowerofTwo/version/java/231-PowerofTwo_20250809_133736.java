// Last updated: 8/9/2025, 1:37:36 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & n-1) == 0;
    }
}