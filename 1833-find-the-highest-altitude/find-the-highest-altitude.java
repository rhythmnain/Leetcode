class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length+1];
        alt[0]=0;
        int maxi=0;
        for(int i=1; i<alt.length; i++){
            alt[i]= alt[i-1]+gain[i-1];
            if(maxi<alt[i]){
                maxi = alt[i];
            } 
        }
        return maxi;
    }
}