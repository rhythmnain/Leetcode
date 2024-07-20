class Solution {
    public String interpret(String command) {
        int n = command.length();
        StringBuilder a = new StringBuilder();
        for(int i=0; i<n; i++){
            char ch = command.charAt(i);
            if(ch != '(' && ch!= ')'){
                a.append(ch);
            } else if(ch ==')' && command.charAt(i-1)=='('){
                a.append('o');
            }
        }
        return a.toString();
    }
}