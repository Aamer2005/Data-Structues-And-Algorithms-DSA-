class Solution {
    public static int fibo(int n) {
        //your code goes here

        if(n==0 )
        return 0;
        else if (n==1)
        return 1;
        else
        return fibo(n-1)+fibo(n-2);
    }

     public static void main(String[] args)
    {
        System.out.println(fibo(5));
        System.out.println(fibo(10));
    }
}