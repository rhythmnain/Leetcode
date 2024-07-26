class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return ans(a,b) || ans(b,a);
    }
     private boolean ans(String a, String b){
        int start =0; 
        int end = a.length()-1;

        while(start<end){
            if(a.charAt(start)!= b.charAt(end))
            break;
            start++;
            end--;
        }
        return ans(a,start,end) || ans(b,start,end);
    }
    private boolean ans(String a, int start, int end){
        while(start<end){
            if(a.charAt(start) != a.charAt(end))
            break;
            start++;
            end--;
        }
        return start>= end;
    }
}