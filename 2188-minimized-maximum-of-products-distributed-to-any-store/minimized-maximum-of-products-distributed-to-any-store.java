class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low =1;
        int high = Arrays.stream(quantities).max().getAsInt();
        while(low<high){
            int mid = low+(high-low)/2;
            int count =0;
            for(int i:quantities) count +=(i+mid-1)/mid;
            if(count <=n) high = mid;
            else low = mid+1;
        }
        return low;
    }
}