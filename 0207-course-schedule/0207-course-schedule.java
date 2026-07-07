class Solution {
    private boolean detect(int node , ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] pathVisited){
        visited[node] = true;
        pathVisited[node] = true;
        for(int neighbour : adj.get(node)){
            if(!visited[neighbour]){
                if(detect(neighbour, adj, visited, pathVisited))
                return true;
            }
            else if(pathVisited[neighbour]){
                return true;
            }
        }
        pathVisited[node] = false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
         for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
         }
         for(int[] edge : prerequisites){
            adj.get(edge[1]).add(edge[0]);
         }
         boolean[] visited = new boolean[numCourses];
         boolean[] pathVisited = new boolean[numCourses];

         for(int i = 0; i < numCourses; i++){
            if(!visited[i]){
                if(detect(i, adj, visited, pathVisited))
                return false;
            }
         }
         return true;
    }
}