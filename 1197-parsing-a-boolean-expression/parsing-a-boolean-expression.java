class Solution {
    int idx = 0;
    public boolean parseBoolExpr(String expression) {
        
        char ch =  expression.charAt(idx++);
        if(ch == 't') return true;
        if(ch =='f') return false;
        idx++;
        List<Boolean> val = new ArrayList<>();
        while(expression.charAt(idx) != ')'){
            if(expression.charAt(idx) != ',') val.add(parseBoolExpr(expression));
            else idx++;
        }
        idx++;
        return ch == '!' ? !val.get(0) : ch == '&' ? val.stream().allMatch(v -> v) : val.stream().anyMatch(v -> v);
    }
}
