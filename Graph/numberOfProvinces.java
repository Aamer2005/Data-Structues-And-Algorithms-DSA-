//leetcode 547 : Number Of Provinces
class Solution {
    public int findCircleNum(int[][] isConnected) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<isConnected.length;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<isConnected.length;i++)
        {
           for(int j=0;j<isConnected.length;j++)
           {
                if(isConnected[i][j]==1)
                {
                    adj.get(i).add(j);
                }
           }
        }

        return DFS(isConnected.length , adj);
        
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