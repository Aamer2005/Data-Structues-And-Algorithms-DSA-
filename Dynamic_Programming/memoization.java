class memoization{

public static int fibo(int n,int[] arr)
{

    if(n==1 || n==0)
    return 1;

    if(arr[n]!=0) return arr[n];

    return arr[n]=fibo(n-1,arr)+fibo(n-2,arr);
}


public static void main(String[] args)
{

int n = 4;
int[] arr= new int[n+1];

System.out.println(fibo(n,arr));

}
}