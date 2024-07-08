class Solution {
    public int reachNumber(int target) {
        target=Math.abs(target);
        int start=1;
        int end=target;
        int mid;
        int steps=0;
        int pos=0;
        long sum=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            sum=(long)mid*(mid+1)/2;
            if(sum>=target)
                {
                    pos=(int)sum;
                    steps=mid;
                    end=mid-1;
                }
            else
                start=mid+1;
        }
        while((pos-target)%2!=0)
        {
            steps++;
            pos+=steps;
        }
        return steps;
    }
}
        // target= Math.abs(target);
        // int sum=0;
        // int steps=0;

        // while(sum<target || (sum-target)%2!=0){
        //     steps++;
        //     sum+=steps;
        // }
        // return steps;
//     }
// }