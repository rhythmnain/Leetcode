public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result=0,i;
        for(i=0;i<32;i++)
        {
            result<<=1;
            result=result|(n&1);
            n>>=1;
        }
        return result;
    }
}