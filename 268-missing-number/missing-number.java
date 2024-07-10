class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!= nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }
        for(int idx= 0; idx<nums.length; idx++){
            if(nums[idx]!= idx){
                return idx;
            } 
        }
        return nums.length;
    }


        // int n = nums.length;
        // int[] v = new int[n+1];
        // Arrays.fill(v, -1);
        // for(int i = 0; i < nums.length; i++) {
        //     v[nums[i]] = nums[i];
        // }
        // for(int i = 0; i < v.length; i++) {
        //     if(v[i] == -1) return i;
        // }
        // return 0;
     public static void swap(int[] nums, int first, int second){
            int temp = nums[first];
            nums[first]=nums[second];
            nums[second]= temp;
        }
}
