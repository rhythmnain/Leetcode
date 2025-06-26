class Solution {
    public int longestSubsequence(String s, int k) {
        int sum = 0;  // \U0001f389 Our piggy bank, starting empty! Will hold the decimal value. \U0001f437
        int len = 0; // \U0001f4cf Counter for the candy line's length!

        int bits = (int)(Math.log(k) / Math.log(2)) + 1; 

        for (int i = s.length() - 1; i >= 0; i--) { 

            char c = s.charAt(i); 

            len += (c == '0') ? 1 : 
                    (i < s.length() - bits || sum + (1 << (s.length() - 1 - i)) > k) ? 0 :  
                    ((sum += 1 << (s.length() - 1 - i)) > -1 ? 1 : 0);  

        }

        return len; // \U0001f381 The longest candy line we could make!
    }
}