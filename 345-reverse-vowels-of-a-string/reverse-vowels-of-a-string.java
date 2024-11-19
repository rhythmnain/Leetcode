class Solution {
    public Boolean vowel(char y){
        return y=='a' || y=='e' || y=='i' || y=='o' || y=='u' || y=='A' || y=='E' || y=='I' || y=='O' || y=='U';
    }

    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int i=0;
        int y=s.length()-1;
        while(i<y){
            while(i<y && !vowel(s.charAt(i))){
                i++;
            }
            while(i<y && !vowel(s.charAt(y))){
                y--;
            }
            char temp = ans[i];
            ans[i]=ans[y];
            ans[y]=temp;
            i++;
            y--;
        }
        return new String(ans);
    }
}