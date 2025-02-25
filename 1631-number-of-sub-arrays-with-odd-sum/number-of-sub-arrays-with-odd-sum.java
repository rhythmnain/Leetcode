class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        int preSum =0;
        int even =1;
        int odd =0;
        int ans =0;
        for(int i =0; i<arr.length; i++){
            preSum += arr[i];
            if(preSum % 2 == 0){
                ans += odd;
                even++;
            } else{
                ans += even;
                odd++;
            }
            ans = ans % mod;
        }
        return ans;
    }
}