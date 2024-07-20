class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        StringBuilder a = new StringBuilder("");
        char ch[]= new char[n];
        for(int i=0; i<n; i++){
            ch[indices[i]]=s.charAt(i);
        }
        a.append(ch);
        return a.toString();
    }
}