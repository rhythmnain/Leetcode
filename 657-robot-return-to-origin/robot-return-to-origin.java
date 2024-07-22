class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int countU = 0;
        int countD = 0; 
        int countL = 0;
        int countR = 0;

        for(int i =0; i<n; i++){
            char ch = moves.charAt(i);
            if(ch == 'L')
            countL++;
            else if(ch =='R')
            countR++;
            else if(ch == 'U')
            countU++;
            else
            countD++;
        }
        return countL==countR && countU==countD;
    }
}