class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int n = nums.length-1;
        while(i<n){
            if(nums[i]%2==0){
                i++;
            }
            else if(nums[n]%2==1){
                n--;
            }
            else{

                int temp =nums[i];
                nums[i]=nums[n];
                nums[n]= temp;
        }
    }
    return nums;
}
}