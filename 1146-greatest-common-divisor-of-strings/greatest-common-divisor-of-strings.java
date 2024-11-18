class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String a = str1 +str2;
        String b = str2 + str1;
        if(!(a).equals(b)){
            return "";
        }
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0,gcd);
    }
    private int gcd(int x, int y){
        return y ==0 ? x :gcd(y, x%y);
    }
}
