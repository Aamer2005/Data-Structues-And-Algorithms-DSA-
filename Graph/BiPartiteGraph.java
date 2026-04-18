//each adjacent node has different color if u -> g then v->b
//graph having odd legth of cycle is not bipartite
// graph having even length of cycle is bipartite

class Solution {
    public boolean isBipartite(int[][] graph) {
        int m = graph.length;
        int n = graph[0].length;

        boolean[] visited = new boolean[m];
        int[] color = new int[m];
        Arrays.fill(color,-1);

        for(int v = 0;v<m;v++)
        {
            if(!visited[v]){
                if(!dfs(graph,visited,color ,v,0)){
                    return false;
                }
            }
        }

        return true;
        
    }

    public boolean dfs(int[][] graph , boolean[] visited , int[] color , int v , int x)
    {
        visited[v] = true;
        color[v] = x;

        for(int u : graph[v]){
            if(!visited[u]){
                if(!dfs(graph , visited , color , u , (x+1)%2))
                return false;
            }
            else if(color[u] == color[v])
            {
                return false;
            }
        }

        return true;
    }
}