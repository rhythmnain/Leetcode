class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];
        int[][] startI= new int[n][2];

        for(int i=0; i<n; i++){
            startI[i][0] = intervals[i][0];
            startI[i][1]=i;
        }

            Arrays.sort(startI, (a,b)-> a[0]-b[0]);

            for(int i=0; i<n; i++){
                int start=0;
                int end = n-1;
                int mid;
                int result = intervals[i][1];
                int ind=-1;

                while(start<=end){
                    mid = start+(end-start)/2;
                    if(startI[mid][0]>= result){
                        ind = startI[mid][1];
                        end = mid-1;
                    } else{
                        start = mid+1;
                    }
                }
                ans[i]=ind;
            }
            return ans;
        
    }
}