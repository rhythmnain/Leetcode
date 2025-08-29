class Solution {
    public long flowerGame(int n, int m) {
        long ans =0;
        for(int i=0; i<m; i++){
            ans+=n;
        }
        return ans/2;
    }
}