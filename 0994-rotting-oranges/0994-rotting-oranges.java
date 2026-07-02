class Pair{
    int row,col,tm;
    Pair(int row, int col, int tm){
        this.row = row;
    this.col = col;
    this.tm = tm;
    }
    }class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cntfresh = 0;
        Queue<Pair> q = new LinkedList<>();
        int[] drow = {1,0,-1,0};
        int[] dcol = {0,1,0,-1};
        int tm = 0;
        int[][] vis = new int[m][n];
        
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(grid[i][j] == 2){
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = 2;
                    }
                    else
                    {
                        vis[i][j] = 0;
                    }
                    if(grid[i][j] == 1)
                    cntfresh++;
            }
        }int cnt = 0;
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tm;
            tm = Math.max(t, tm);
            q.remove();
            for(int i = 0; i < 4; i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                q.add(new Pair(nrow,ncol,t+1));
                vis[nrow][ncol] = 2;
                cnt ++;}
            }
        }
        if(cnt != cntfresh)
        return -1;
        return tm;
    }
}