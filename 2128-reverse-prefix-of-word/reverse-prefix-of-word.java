class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int idx = word.indexOf(ch);

        if(idx==-1){
            return word;
        }
        StringBuilder sb = new StringBuilder(word.substring(0,idx+1));
        sb.reverse();
        if(idx+1<n){
            sb.append(word.substring(idx+1));
        }
        return sb.toString();
    }
}