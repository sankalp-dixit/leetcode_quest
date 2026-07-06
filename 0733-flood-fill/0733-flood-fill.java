class Pair{
    int row,col;
    Pair(int row, int col){
        this.row = row;
    this.col = col;
    }
}
 class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
         int[][] vis = new int[m][n];
for (int i = 0; i < m; i++) {
    vis[i] = image[i].clone();
}
         Queue<Pair> q = new LinkedList<>();
          int[] drow = {1,0,-1,0};
        int[] dcol = {0,1,0,-1};
         q.add(new Pair(sr,sc));
         while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            vis[r][c] = color;
            int initialColor = image[sr][sc];
            q.remove();
            for(int i = 0; i < 4; i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && vis[nrow][ncol] != color &&
    image[nrow][ncol] == initialColor){
                q.add(new Pair(nrow,ncol));
                vis[nrow][ncol] = color;
                }
            
            }
         }
            return vis;
    }
 }
 