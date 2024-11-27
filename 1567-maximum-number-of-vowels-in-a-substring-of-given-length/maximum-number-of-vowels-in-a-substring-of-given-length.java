class Solution {
    public int maxVowels(String s, int k) {
        int i=0,j=0;
        int count=0;
        int max = 0;
        while(j<s.length()){
            if(isVowel(s.charAt(j))){
                count++;
            }
            if(j-i+1<k){
                j++;
            }else{
                max = Math.max(max,count);
                if(isVowel(s.charAt(i))){
                    count--;
                }
                i++;
                j++;
            }
        }
        return max;
    }
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}