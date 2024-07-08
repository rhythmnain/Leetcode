class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end = nums.length-1;
        int mid;
        int ans = nums[start];

        while(start<=end){
            mid = start+(end-start)/2;
            if (nums[mid] < ans) {
                ans = nums[mid];
            } else if(nums[start]<nums[mid]){
                if(nums[mid]<nums[end]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            } else{
                if(nums[mid]<nums[end]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return ans;
    }
}
//         int n = nums.length;
// 		int left = 0;
// 		int right = n - 1;
// 		int mid = 0;
// 		int target = nums[left];
// 		while (left <= right) {
// 			mid = (left + right) / 2;
// 			if (nums[mid] < target) {
// 				target = nums[mid];
// 			} else if (nums[left] < nums[mid]) {
// 				// left is sorted
// 				if(nums[mid] < nums[right])
// 					right = mid - 1;
// 				else
// 					left = mid + 1;
// 			} else {
// 				if(nums[mid] < nums[right])
// 					right = mid - 1;
// 				else
// 					left = mid + 1;
// 			}
// 		}
// 		return target;
//     }
// }