class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<1){
            return false;
        }
        long start=0; 
        long end = num;
        long mid;

        while(start<=end){
            mid = start+(end-start)/2;
            long ans = mid*mid;

            if(ans==num){
                return true;
            } else if(ans<num){
                start= mid+1;
            } else{
                end = mid-1;
            }
        }
        return false;
    }
}