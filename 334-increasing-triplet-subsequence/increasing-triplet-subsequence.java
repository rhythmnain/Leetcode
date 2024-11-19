class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = Integer.MAX_VALUE;
        int m = Integer.MAX_VALUE;
        for(int i : nums){
            if(i<=n)
            n =i;
            else if(i<=m)
            m=i;
            else
            return true;
        }
        return false;
    }
}