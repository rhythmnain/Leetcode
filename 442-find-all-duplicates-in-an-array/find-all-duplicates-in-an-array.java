class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int idx=0; idx<nums.length; idx++){
            if(nums[idx]!=idx+1){
                ans.add(nums[idx]);
            }
        }
        return ans;
    //     int n = nums.length;
    //     for (int i = 0; i < n; i++) {
    //         int x = Math.abs(nums[i]);
    //         if (nums[x - 1] < 0) {
    //             ans.add(x);
    //         }
    //         nums[x - 1] *= -1;
    //     }
    //     return ans; 
    // }
    }
public static void swap(int[] nums, int a, int b){
    int temp = nums[a];
    nums[a]= nums[b];
    nums[b]= temp;
}
}