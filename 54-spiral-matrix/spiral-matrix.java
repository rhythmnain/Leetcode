import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> ans = new ArrayList<>();
        if (m == null || m.length == 0) {
            return ans;
        }

        int row = m.length;
        int col = m[0].length;
        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right across the top row
            for (int i = left; i <= right; i++) {
                ans.add(m[top][i]);
            }
            top++;

            // Traverse from top to bottom down the right column
            for (int i = top; i <= bottom; i++) {
                ans.add(m[i][right]);
            }
            right--;

            // Check if there are rows left to traverse
            if (top <= bottom) {
                // Traverse from right to left across the bottom row
                for (int i = right; i >= left; i--) {
                    ans.add(m[bottom][i]);
                }
                bottom--;
            }

            // Check if there are columns left to traverse
            if (left <= right) {
                // Traverse from bottom to top up the left column
                for (int i = bottom; i >= top; i--) {
                    ans.add(m[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}

        // int l=0,r=m[0].length-1,u=0,d=m.length-1;
        // List<Integer> ll=new ArrayList<>();
        // while(true){
        //     if(l<=r){
        //         for(int i=l;i<=r;++i){
        //             ll.add(m[u][i]);
        //         }
        //         u++;
        //     }else break;
        //     if(u<=d){
        //         for(int i=u;i<=d;++i){
        //             ll.add(m[i][r]);
        //         }
        //         r--;
        //     }else break;
        //     if(l<=r){
        //         for(int i=r;i>=l;--i){
        //             ll.add(m[d][i]);
        //         }
        //         d--;
        //     }else break;
        //     if(u<=d){
        //         for(int i=d;i>=u;--i){
        //             ll.add(m[i][l]);
        //         }
        //         l++;
        //     }else break;
//         }
//         return ll;
//     }
// }