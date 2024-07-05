class Solution {
    public int arrangeCoins(int n) {
        long start =0;
        long end = n;
        long mid;

        while(start<=end){
            mid = start+(end-start)/2;
            long sum = mid*(mid+1)/2; //sum of mid natural numbers sum = n(n+1)/2

            if(sum==n){
                return (int)mid;
            } else if(sum<n){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return (int)end;
    }
}