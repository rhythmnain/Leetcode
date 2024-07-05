class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int start = 0; int end = numbers.length-1;
        int sum;
        
        
        while(start<end){
            sum = numbers[start]+numbers[end];
            if(sum==target){
                return new int[]{start+1, end+1};
            } else if(sum<target){
                start=start+1;
            } else{
                end = end-1;
            }
        }
        return new int[]{0,0};
        //  int l = 0;
        // int r = numbers.length - 1;

        // while (l < r) {
        //     int sum = numbers[l] + numbers[r];

        //     if (sum == target) {
        //         return new int[]{l + 1, r + 1};
        //     } else if (sum < target) {
        //         l++;
        //     } else {
        //         r--;
        //     }
        // }
        // return new int[]{0, 0};
        
    }
}