// Last updated: 8/20/2025, 7:59:45 PM
class Solution {
    public int countSquares(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] mat = new int[n][m];
        int result =0;

        for(int i =0; i<n; i++){
            mat[i][0] = matrix[i][0];
            result+= mat[i][0];
        }
        for(int j =1; j<m; j++){
            mat[0][j] = matrix[0][j];
            result += mat[0][j];
        }
        for(int i =1; i<n; i++){
            for(int j =1; j<m; j++){
                if(matrix[i][j]==1){
                    mat[i][j] = 1 + Math.min(Math.min(mat[i][j-1], mat[i-1][j]), mat[i-1][j-1]);
                }
                result += mat[i][j];
            }
        }
        return result;
    }
}