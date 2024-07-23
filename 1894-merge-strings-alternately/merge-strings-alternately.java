class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int count1=0; 
        int count2=0; 
        while(count1<n && count2<m){
            sb.append(word1.charAt(count1++));
            sb.append(word2.charAt(count2++));
        }
        while(count1<n){
            sb.append(word1.charAt(count1++));
        }
        while(count2<m){
            sb.append(word2.charAt(count2++));
        }
        return sb.toString();
    }
}