class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        int[][] vis = new int[m][n];
        for(int i = 0; i < m; i++){
            if(vis[i][0] == 0 && grid[i][0] == 1)
            dfs(i, 0, grid, vis, drow, dcol);
            if(vis[i][n-1] == 0 && grid[i][n-1] == 1)
            dfs(i, n - 1, grid, vis, drow, dcol);
        }
        for(int i= 0; i < n; i++){
            if(vis[0][i] == 0 && grid[0][i] == 1)
            dfs(0, i, grid, vis, drow, dcol);
            if(vis[m-1][i] == 0 && grid[m - 1][i] == 1)
            dfs(m - 1, i,  grid, vis, drow, dcol);
        }
        int c = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(vis[i][j] == 0 && grid[i][j] == 1)
                c++;
            }
        }
        return c;
    }
    static void dfs(int row, int col, int[][] grid, int[][] vis, int[] drow , int[] dcol){
        vis[row][col] = 1;
        int m = vis.length;
        int n = vis[0].length;
        for(int i = 0; i < 4; i++){
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if(nrow >= 0 && nrow < m && ncol >=0 && ncol < n && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1)
            dfs(nrow, ncol, grid, vis, drow, dcol);
        }

    }
}