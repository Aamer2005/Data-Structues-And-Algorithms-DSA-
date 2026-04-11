/*Input: V=4, edges=[[0,1],[1,2]]

Output: 2

Explanation: Vertices {0,1,2} forms the first component and vertex 3 forms the second component
*/


class Solution {
    public int findNumberOfComponent(int V, List<List<Integer>> edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.size();i++)
        {
           
                adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
                adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }

        return DFS( V , adj);
    
    }

    int DFS( int V , ArrayList<ArrayList<Integer>> adj)
    {
        int count = 0;
        boolean[] visited = new boolean[V];

        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                count+=1;
                visit_DFS( i , adj,visited);
            }
        }

        return count;
    }

    void visit_DFS(int v , ArrayList<ArrayList<Integer>> adj,boolean[] visited)
    {
        visited[v] = true;

        for(Integer u : adj.get(v))
        {
            if(!visited[u])
            {
                visit_DFS(u,adj,visited);
            }
        }
    }

}
