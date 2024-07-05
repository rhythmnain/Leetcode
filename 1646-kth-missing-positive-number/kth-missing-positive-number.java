class Solution {
    public int findKthPositive(int[] arr, int k) {
        //we will be using binary search
        int start=0;
        int end = arr.length-1;
        int mid;

        while(start<=end){
            mid = start+(end-start)/2;

            if(arr[mid]-(mid+1)<k){
                start=mid+1;
            } else{
                end = mid-1;
            }
        }
        return start+k;
    }
}