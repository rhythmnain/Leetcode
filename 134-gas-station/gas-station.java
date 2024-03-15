class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int idx=0;
        while(idx<gas.length){
            int x=isValid(idx,gas,cost);
            if(x==idx) return idx;
            idx=x;
        }
        return -1;
    }
    public int isValid(int idx,int[] gas,int[] cost){
        int sum=0;
        sum+=gas[idx];
        int x=idx;
        for(int i=idx;i<gas.length;i++){
            sum-=cost[i];
            x++;
            if(sum<0){
                return x;
            }
            if(i<gas.length-1) sum+=gas[i+1];
        }
        sum+=gas[0];
        for(int i=0;i<idx;i++){
            sum-=cost[i];
            x++;
            if(sum<0){
                return x;
            }
            sum+=gas[i+1];
        }
        return idx;
    }
}