//knapsack using recursion only
class KnapSackRecursion{

    public static int knapsack(int W,int[] val , int[] wt , int n){
        if(W==0 || n==0) return 0;

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

