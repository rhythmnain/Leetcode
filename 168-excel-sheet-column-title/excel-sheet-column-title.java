class Solution {
    public String convertToTitle(int col) {
        StringBuilder sb = new StringBuilder();
        while(col>0){
            col--;
            sb.append((char)('A' + col%26));
            col/=26;
        }
        return sb.reverse().toString();
    }
}