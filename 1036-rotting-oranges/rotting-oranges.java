class Solution {

    public int orangesRotting(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        if(n == 0)return 0;
        Queue<int[]> q = new LinkedList<>();
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2)
                    q.offer(new int[]{i, j});
                if(grid[i][j] == 1)count++;
            }
        } 
        if(count == 0)return 0;
        int[] drow = {1, 0, -1, 0};
        int[] dcol = {0, -1, 0, 1};
        int minute = 0;
        while(!q.isEmpty()){
            minute++;
            int size = q.size();
            while(size-- >0){
                int x = q.peek()[0];
                int y = q.peek()[1];
                q.remove();

                for(int i=0;i<4;i++){
                    int row = x+drow[i];
                    int col = y+dcol[i];
                    if(row>=0 && row<n && col>=0 && col<m && grid[row][col] == 1){
                        count--;
                        grid[row][col] = 2;
                        q.offer(new int[]{row, col});
                    }
                }

            }
        }
       
        if(count > 0) return -1;
        return minute==0?0:minute-1;
    }
}