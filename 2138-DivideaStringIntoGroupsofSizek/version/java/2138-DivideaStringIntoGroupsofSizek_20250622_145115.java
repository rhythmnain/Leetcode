// Last updated: 6/22/2025, 2:51:15 PM
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int numGroups = (n + k - 1) / k; // Ceiling division to determine number of groups
        String[] result = new String[numGroups];
        
        for (int i = 0; i < numGroups; i++) {
            int start = i * k;
            int end = Math.min(start + k, n);
            StringBuilder group = new StringBuilder(s.substring(start, end));
            
            // If the group is shorter than k, append fill characters
            while (group.length() < k) {
                group.append(fill);
            }
            
            result[i] = group.toString();
        }
        
        return result;
    }
}
