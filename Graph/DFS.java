class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> result = new ArrayList<>();
        
        DFS(adj , visited , result);
        
        return result;
        
    }
    int time = 0;
    
       public void DFS(ArrayList<ArrayList<Integer>> adj ,boolean[] visited ,ArrayList<Integer> result){
        
        for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==false){
                DFS_visit( i ,adj , visited , result);
            }
        }
        
    }
   
    public void DFS_visit(int v ,ArrayList<ArrayList<Integer>> adj ,boolean[] visited ,ArrayList<Integer> result ){
        time = time+1;
        
        result.add(v);
        visited[v] = true;
        
        for(int u : adj.get(v))
        {
            if(visited[u]==false)
            {
                DFS_visit(u,adj,visited,result);
            }
        }
        time=time+1;
    }
    
     
 
    
}