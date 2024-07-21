class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] ans = new String[arr.length];
        int val;
        for(String i:arr){
            val = i.charAt(i.length()-1)-'0'-1;
            ans[val]= i.substring(0, i.length()-1);
        } 
        StringBuilder sb = new StringBuilder();
        for(String i:ans){
            sb.append(i);
            sb.append(' ');
        }
        return sb.toString().trim();
    }
}