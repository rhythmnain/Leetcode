class Solution {
    public int maxRepeating(String sequence, String word) {
        int count =0; 
        String str = word;
        while(sequence.contains(word) == true){
            count++;
            word+= str;
        }
        return count;
    }
}