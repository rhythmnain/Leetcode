class Solution {
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;

        int[] inDeg = new int[n];
        int[] queue = new int [n];
        int[] depth = new int[n];

        //count in degrees
        for(int i =0; i<n; i++){
            inDeg[favorite[i]]++;
        }

        //topological sorting
        int l =0, r =0;
        for(int i =0; i<n; i++){
            if(inDeg[i] == 0) queue[r++] = i;
        }
        while(l<r){
            int cur = queue[l++];
            int next = favorite[cur];
            depth[next] = Math.max(depth[next], depth[cur]+1);
            if(--inDeg[next]== 0){
                queue[r++] = next;
            }
        }
        int smallCir =0;
        int bigCir =0;

        for(int i =0; i<n; i++){
            if(inDeg[i] != 0){
                inDeg[i] =0;
                int count =1;

                for(int j = favorite[i]; j != i; j = favorite[j]){
                    count++;
                    inDeg[j]=0;
                }
                if(count == 2){
                    smallCir += depth[i] + depth[favorite[i]]+2;
                } else{
                    bigCir = Math.max(bigCir, count);
                }
            }
        }
        return Math.max(bigCir, smallCir);
    }
}