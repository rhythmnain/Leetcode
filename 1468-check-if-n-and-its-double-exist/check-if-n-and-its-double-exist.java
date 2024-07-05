class Solution {
    public boolean checkIfExist(int[] arr) {

        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr.length;j++){
            if(arr[i] == 2*arr[j] && i!=j){
                return true;
            }
            }
            
        }
        return false;
    }
}
//         // Arrays.sort(arr);
//         // int n = arr.length;
        
//         // for(int i=0; i<n; i++){
//         //     int start= 0;
//         //     int end = n-1;
//         //     int mid;
//         //     while(start<=end){
//         //         mid = start+(end-start)/2;
//         //         if(arr[i]*2==arr[mid] && i!= mid){
//         //             return true;
//         //         } else if(arr[i]*2>arr[mid]){
//         //             start = mid+1;
//         //         } else{
//         //             end = mid-1;
//         //         }
//         //     }
//         // }
//         // return false;
//     }
// }