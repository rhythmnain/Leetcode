class Solution {
  public int findDuplicate(int[] nums) {
    int i =0;
    while(i<nums.length){

        if(nums[i]!= i+1){
            int correct= nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            } else{
                return nums[i];
            }
        }else{
            i++;
        }
    }
    return 0;
  }
static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]= nums[b];
        nums[b]= temp;
    }
    // int slow = nums[0];
    // int fast = nums[0];
    // do {
    //   slow = nums[slow];
    //   fast = nums[nums[fast]];
    // } while (slow != fast);

    // fast = nums[0];
    // while (slow != fast) {
    //   slow = nums[slow];
    //   fast = nums[fast];
    // }
    // return slow;
  }
