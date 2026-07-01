class Solution {
    private static void dfs(int node, int[][] isConnected, Set<Integer> visited){
        visited.add(node);
        for(int cur = 0; cur < isConnected[node].length; cur++){
            int connected = isConnected[node][cur];
            if(connected == 1 && !visited.contains(cur))
            dfs(cur, isConnected, visited); 
        }
    }
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> visited = new HashSet<>();
        int prov = 0;
        for(int i = 0; i < isConnected.length; i++){
            if(!visited.contains(i)){
                dfs(i, isConnected, visited);
                prov++;
            }
        }
        return prov;
    }
}