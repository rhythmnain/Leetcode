// Last updated: 5/15/2025, 8:07:47 PM
// This is the solution of Longest Unequal Adjacent Groups Subsequence I
class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        int order = -1;
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != order) {
                order = groups[i];
                res.add(words[i]);
            }
        }
        return res;
    }
}