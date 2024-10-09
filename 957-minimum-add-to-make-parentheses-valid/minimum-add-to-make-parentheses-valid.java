class Solution {
    public int minAddToMakeValid(String s) {
        int y =0;
        int n=0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                y++;
            }else{
                if(y>0){
                    y--;
                }else{
                    n++;
                }
            }
        }
        return y+n;
    }
}