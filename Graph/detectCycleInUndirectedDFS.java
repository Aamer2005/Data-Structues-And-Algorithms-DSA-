import java.util.*;
class Solution{

    //note : if node has two parent then thier is chance of cycle 
    // only parent is visited first then child but if adjNode is visited before node then it may be a parent
    // if adjNode is not parent of node then cycle  

    boolean isCycle(int V , ArrayList<ArrayList<Integer>> adj){

        boolean[] visited = new boolean[V];
        Stack<int[]> st = new Stack<>();

        //for componenets
        for(int v=0;v<V;v++){
            if(!visited[v]){
                if(dfs_visit(v,adj,visited,st)) return true;
            }
        }

        return false;
    }

   

    boolean dfs_visit(int v, ArrayList<ArrayList<Integer>> adj,boolean[] visited , Stack<int[]> st){

        st.push(new int[]{v,-1});
        visited[v] = true;

        while(!st.isEmpty()){
            int[] vertex = st.pop();
            int node = vertex[0];
            int parent = vertex[1];

            for(Integer adjacentNode : adj.get(node)){

                if(!visited[adjacentNode]){
                    st.push(new int[]{adjacentNode,node});
                    visited[adjacentNode] = true;
                }
                else if(adjacentNode!=parent){
                    return true;
                }
            }

        }

        return false;
    }

     public static void main(String[] args) {

        int V = 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // edges (undirected graph)
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);

        Solution obj = new Solution();

        boolean hasCycle = obj.isCycle(V, adj);

        if (hasCycle) {
            System.out.println("Cycle is present");
        } else {
            System.out.println("No cycle");
        }
    }

    // helper function for undirected graph
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}