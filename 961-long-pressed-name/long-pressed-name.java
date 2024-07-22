class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int a = name.length();
        int b = typed.length();
        
        if (a > b) {
            return false; // If name is longer than typed, it's impossible
        }
        
        int i = 0; // Index for name
        int j = 0; // Index for typed
        
        while (j < b) {
            if (i < a && name.charAt(i) == typed.charAt(j)) {
                // Characters match, move both indices forward
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                // Current character in typed is a repeated long press of the previous character
                j++;
            } else {
                // Mismatch or end of name without matching typed
                return false;
            }
        }
        
        // Check if we've matched all characters in name
        return i == a;
    }
}
