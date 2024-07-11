class Solution {
    public int firstMissingPositive(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
        if(nums[i]>0 && nums[i]<nums.length && nums[i]!= nums[correct]){
            swap(nums, i, correct);
        }else{
            i++;
        }
        }
    
    for(int idx=0; idx<nums.length; idx++){
        if(nums[idx]!= idx+1){
            return idx+1;
        }
    }
    return nums.length+1;
    }
    public static void swap(int[] nums, int a , int b){
        int temp = nums[a];
        nums[a]= nums[b];
        nums[b]= temp;
    }
}
        // HashSet<Integer> set=new HashSet<>();
        // int n=nums.length;
        // for(int num:nums){
        //     if(num>0){
        //         set.add(num);
        //     }
        // }
        // for(int i=1;i<=n+1;i++){
        //     if(!set.contains(i)){
        //         return i;
        //     }
        // }
        // return -1;
//     }
// }