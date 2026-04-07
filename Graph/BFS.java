class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        boolean[] visited = new boolean[adj.size()];
        
        Queue<Integer> queue = new LinkedList<>();
        
        ArrayList<Integer> al = new ArrayList<>();
        
        queue.add(0);
        visited[0] = true;
        al.add(0);
        
        while(!queue.isEmpty()){
            Integer v = queue.poll();
            for(Integer u : adj.get(v))
            {
                if(!visited[u])
                {
                visited[u] = true;
                al.add(u);
                queue.add(u);
                }
            }
        }
        
        return al;
    }
}