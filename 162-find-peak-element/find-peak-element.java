class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] > nums[mid + 1]) {
                // Peak is in the left half, including mid
                end = mid;
            } else {
                // Peak is in the right half, excluding mid
                start = mid + 1;
            }
        }
        // start and end converge to the peak element
        return start;
    }
}
        
        // int n=nums.length;
        // int[] arr;
        // if(n==1){
        //     return 0;
        // }
        // else if (nums[0]>nums[1]){
        //     return 0;
        // }
        // else if(nums[n-1]>nums[n-2])
        // {
        //     return n-1;
        // }
        // else
        // {
        //     for(int i=1;i<n-1;i++){
        //         if(nums[i-1]<=nums[i] && nums[i]>=nums[i+1]){
        //             return i;
        //         }
        //     }
        // }
        // return -1;