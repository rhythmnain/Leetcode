class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int a =0;
        int max = nums[nums.length-1];
        for(int i=nums.length-1; i>= 0; i--){
            if(i==nums.length-1 || nums[i]!= nums[i+1]){
                a++;
                if(a==3){
                    return nums[i];
                }
            }
        }
        return max;
    }
}