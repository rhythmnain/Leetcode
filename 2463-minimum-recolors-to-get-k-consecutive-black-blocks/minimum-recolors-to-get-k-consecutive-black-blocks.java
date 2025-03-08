class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        int result = Integer.MAX_VALUE;

        for(int i =0; i<blocks.length(); i++){
            if(i-k>=0 && blocks.charAt(i-k)== 'B'){
                count--;
            }
            if(blocks.charAt(i)=='B')
            count++;
            result = Math.min(result, k - count);
        }
        return result;
    }
}