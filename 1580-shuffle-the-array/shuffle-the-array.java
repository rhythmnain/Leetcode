class Solution {
    public int[] shuffle(int[] nums, int n) {
        int temp [] = new int[n];
        for(int i =n; i<nums.length; i++){
            temp[i-n]= nums[i];
        }
        int arr[] = new int[2*n];
        int i =0;
        for(int j = 0; j<2*n; j=j+2){
            arr[j] = nums[j-i];
            arr[j+1] = temp[j-i];
            i++;
        }
        return arr;
    //  int[] result = new int[2 * n];
    //     int index = 0;
    //     for (int i = 0; i < n; i++) {
    //         result[index++] = nums[i];
    //         result[index++] = nums[i + n];
    //     }
    //     return result;
    }
}