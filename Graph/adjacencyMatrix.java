class Graph{
    int[][] array;
    java.util.Scanner sc = new java.util.Scanner(System.in);

    public void createGraph()
    {
        System.out.print("Enter Nodes : ");
        int node = sc.nextInt();
        System.out.print("Enter Edges : ");
        int edge = sc.nextInt();

        array = new int[node+1][node+1];

        int u,v,weight;
        
        for(int i=1;i<=node;i++)
        {
            System.out.println("Enter u and v and weight respectively");
            u = sc.nextInt();
            v= sc.nextInt();
            weight = sc.nextInt();

            array[u][v] = weight;
            array[v][u] = weight;//for directed comment this line
        }
        
    }

    public void getAdjacencyMatrix()
    {
        for(int[] i : array)
        System.out.println(java.util.Arrays.toString(i));
    }
}