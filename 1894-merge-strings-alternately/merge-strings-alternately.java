class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int m = word1.length();
        int n = word2.length();
        int cnt1 =0;
        int cnt2 =0;
        while(cnt1<m && cnt2<n){
            sb.append(word1.charAt(cnt1++));
            sb.append(word2.charAt(cnt2++));
        }
        while(cnt1<m){
            sb.append(word1.charAt(cnt1++));
        }
        while(cnt2<n){
            sb.append(word2.charAt(cnt2++));
        }

        return sb.toString();
    }
}
