class Solution {
    public int numberOfSteps(int num) {
        return result(num,0);
    }
    private int result(int num, int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return result(num/2, steps+1);
        }
        return result(num-1, steps+1);
    }
}