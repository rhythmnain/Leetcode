class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int count1 =0;
        int count2 = 0;
        String vowels = "aeiouAEIOU";
        for(int i=0; i<n/2; i++){
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) != -1)
            count1++;
        } 
        for(int i=n/2; i<n; i++){
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) != -1)
            count2++;
        }
        return count1==count2;
    }
}