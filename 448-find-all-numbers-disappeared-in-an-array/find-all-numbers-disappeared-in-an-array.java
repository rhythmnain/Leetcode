class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!= nums[correct]){
                swap(nums,i,correct);
            } else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int idx=0; idx<nums.length; idx++){
            if(nums[idx]!=idx+1){
                ans.add(idx+1);
            }
        }
        return ans;
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}