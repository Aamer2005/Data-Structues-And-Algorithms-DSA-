class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        // Step 1: Create adjacency list
        for(int i=0;i<V;i++)
        {
            ArrayList<Integer> al = new ArrayList<>();
            adj.add(al);
        }
        // Step 2: Build graph
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        

        Stack<Integer> stack = new Stack<>();

        boolean[] isVisited = new boolean[V];

        for(Integer v = 0; v<V ; v++)
        {
            if(!isVisited[v])
            {
                dfs_visit(adj,v,isVisited ,stack);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while(!stack.isEmpty())
        {
            result.add(stack.pop());
        }
        
       // System.out.println(result);
        
        return result;
    }
    
    public void dfs_visit(ArrayList<ArrayList<Integer>> adj,Integer v ,boolean[] isVisited , Stack<Integer> stack)
    {
        
        isVisited[v] = true;
        
        for( Integer u: adj.get(v))
        {
            if(!isVisited[u])
            {
                dfs_visit(adj,u ,isVisited,stack);
            }
        }

        stack.push(v);

    }
}