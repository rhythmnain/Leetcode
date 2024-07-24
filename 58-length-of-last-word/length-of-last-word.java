class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int m = 0;
        boolean found = false;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { 
                m++;
                found = true;
            } else if (found) {
                break;
            }
        }
        return m;
    }
}
