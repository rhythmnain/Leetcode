// Last updated: 5/27/2025, 7:43:03 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) num2 += i;
            else num1 += i;
        }
        return num1 - num2;
    }
}