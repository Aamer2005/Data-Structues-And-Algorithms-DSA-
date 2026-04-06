//knapsack using memoization
class KnapSack{

    public static int knapsack(int W,int[] val , int[] wt , int n ,int[][] memo){
        if(W==0 || n<0) return 0;

        if(memo[n][W]!=-1){
            return memo[n][W];

        }

        int pick = 0;

        if(wt[n]<=W)
        pick = val[n]+knapsack(W-wt[n],val,wt,n-1,memo);

        int notpick = knapsack(W,val,wt,n-1,memo);

        return memo[n][W] = Math.max(pick,notpick);
    }

    public static void main(String[] args){
        int n = 3;
       int  W = 4;
       int val[] = {1,2,3};
       int wt[] = {4, 5, 1};
       int[][] memo = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++)
                memo[i][j] = -1;
        }

       System.out.println(knapsack(W,val,wt , n-1,memo));

    }

}


//knapsack using recursion only
class KnapSackRecursion{

    public static int knapsack(int W,int[] val , int[] wt , int n){
        if(W==0 || n<0) return 0;

        int pick = 0;

        if(wt[n]<=W)
        pick = val[n]+knapsack(W-wt[n],val,wt,n-1);

        int notpick = knapsack(W,val,wt,n-1);

        return Math.max(pick,notpick);
    }

    public static void main(String[] args){
        int n = 3;
       int  W = 4;
       int val[] = {1,2,3};
       int wt[] = {4, 5, 1};
        
       System.out.println(knapsack(W,val,wt , n-1));
    }

}

