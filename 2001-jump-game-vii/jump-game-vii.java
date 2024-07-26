class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if(s.charAt(n-1)=='1'){
            return false;
        }
        boolean[] arr= new boolean[n];
        arr[0]= true;
        int maxIdx=0;
        for(int i=0; i<n; i++){
            if(arr[i]){
                for(int j=Math.max(i+minJump, maxIdx+1); j<= Math.min(i+maxJump, n-1); j++){
                    if(s.charAt(j)=='0'){
                        arr[j]=true;
                    }
                }
                maxIdx = Math.max(maxIdx, i+maxJump);
            }
        }
        return arr[n-1];
    }
}
//         int n = s.length();
//         if(s.charAt(n-1)=='1')
//         return false;

//         int idx=0;
//         int maxIdx=0;

//         while(idx<=maxIdx){
//             if(idx==n-1){
//                 return true;
//             }
//             for(int j= minJump; j<=maxJump; j++){
//                 int newIdx = idx+j;

//                 if(newIdx<n && s.charAt(newIdx)=='0')
//                 maxIdx = Math.max(maxIdx, newIdx);
//             }
//             idx++;
//         }
//         return maxIdx>=n-1;
//     }
// }