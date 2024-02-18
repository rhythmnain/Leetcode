class Solution {
    public int[][] generateMatrix(int n) {
       int rowSt = 0, rowEnd = n - 1, colSt = 0, colEnd = n - 1;
        int[][] arr =  new int[n][n];
        int val = 1;
        while(val <= n * n){
            
            for(int i = colSt; i <= colEnd; i++){
                arr[rowSt][i] = val++;
            }
            
            for(int i = rowSt + 1; i <= rowEnd; i++){
                arr[i][colEnd] = val++;
            }
          
            if(rowEnd != rowSt){
                for(int i = colEnd - 1; i >= colSt; i--){
                    arr[rowEnd][i] = val++;
                }
            }
            
            if(colEnd != colSt){
                for(int i = rowEnd - 1; i > rowSt; i--){
                    arr[i][colSt] = val++;
                }
            }
            rowSt++;
            rowEnd--;
            colSt++;
            colEnd--;
        }
        return arr;
    }
}