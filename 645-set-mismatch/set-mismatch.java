class Solution {
    public int[] findErrorNums(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!= nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for(int idx=0; idx<nums.length; idx++){
            if(nums[idx]!= idx+1){
                return new int[]{nums[idx], idx+1};
            } 
        }
        return new int[]{-1,-1};
    }
    public static void swap(int[] nums, int a, int b){
        int temp= nums[a];
        nums[a]= nums[b];
        nums[b]= temp;
    }
}