class Solution {
    public int maximumWealth(int[][] accounts) {
        // int a = Integer.MIN_VALUE;
        // for(int p=0; p<accounts.length; p++){
        //     int sum =0;
        //     for(int q=0; q<accounts[p].length; q++){
        //         sum+= accounts[p][q];
        //     }
        //     if(sum>a){
        //         a=sum;
        //     }
        // }
        // return a;
        int maxWealth =0;
        for(int[] customer:accounts){
            int currentWealth=0;
            for(int account:customer){
                currentWealth += account;
            }
                maxWealth = Math.max(maxWealth,currentWealth);
            }
            return maxWealth;
        }
}