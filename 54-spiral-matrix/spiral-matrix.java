class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int l=0,r=m[0].length-1,u=0,d=m.length-1;
        List<Integer> ll=new ArrayList<>();
        while(true){
            if(l<=r){
                for(int i=l;i<=r;++i){
                    ll.add(m[u][i]);
                }
                u++;
            }else break;
            if(u<=d){
                for(int i=u;i<=d;++i){
                    ll.add(m[i][r]);
                }
                r--;
            }else break;
            if(l<=r){
                for(int i=r;i>=l;--i){
                    ll.add(m[d][i]);
                }
                d--;
            }else break;
            if(u<=d){
                for(int i=d;i>=u;--i){
                    ll.add(m[i][l]);
                }
                l++;
            }else break;
        }
        return ll;
    }
}