// This is approach 1
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}


// This is approach 2

// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         StringBuilder sb = new StringBuilder();
//         int n = word1.length();
//         int m = word2.length();
//         int count1=0; 
//         int count2=0; 
//         while(count1<n && count2<m){
//             sb.append(word1.charAt(count1++));
//             sb.append(word2.charAt(count2++));
//         }
//         while(count1<n){
//             sb.append(word1.charAt(count1++));
//         }
//         while(count2<m){
//             sb.append(word2.charAt(count2++));
//         }
//         return sb.toString();
//     }
// }