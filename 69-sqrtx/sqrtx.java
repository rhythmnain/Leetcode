class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        int start = 1;
        int end = x;
        int ans = 0;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return ans;
    }
}

// class Solution {
//     public int mySqrt(int x, int[] arr) {
      
//         // if (x == 0 || x == 1)
//         //     return x;
//         // int start = 1;
//         // int end = x-1;
                
//         // while (start <= end) {
//         //    int mid = start + (end - start) / 2;
//         //     if ((long) mid * mid > (long) x)
//         //         end = mid - 1;
//         //     else if (mid * mid == x)    
//         //         return mid;
//         //     else      
//         //         start = mid + 1;
//         // }
//         //     return Math.round(end);

//         if(x==0||x==1){
//             return x;
//         }
//         int start = 0;
//         int end = arr.length-1;

//         while(start<= end){
//             int mid = start+ (end-start)/2;

//             if(x<arr[mid]){
//                 end = mid -1;
//             }
//             else if(x>arr[mid]){
//                 start = mid+1;

//             } else {
//                 return mid;
//             }

//         } return Math.round(end);
//     }
// }