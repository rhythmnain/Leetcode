class Solution {
    public boolean search(int[] nums, int target) {
        int start =0; 
        int end = nums.length-1;
        int mid;

while(start<=end){
    mid = start+(end-start)/2;
    if(nums[mid]== target){
        return true;
    }
         if(nums[start]==nums[mid]&& nums[mid]== nums[end]){
            start = start+1;
            end = end -1;
        }
    else if(nums[start]<=nums[mid]){
        if(nums[start]<=target && target <=nums[mid]){
            end = mid-1;
        } else{
            start = mid+1;
        }
    } else{
        if(nums[mid+1]<=target && target<= nums[end]){
            start = mid+1;
        } else{
            end = mid-1;
        }
    }
}
return false;
        //     }else{
        //         if(nums[mid+1] <= target && target <= nums[high])
        //             low = mid + 1;
        //         else
        //             high = mid-1; 
        //     }
        // }

        // return false;
    }
}