class Euclidean{

public static int euclidean(int m , int n){

    int r;
    while(m%n!=0)
    {
        r = m%n;
        m = n;
        n = r;
    }

    return n;
}

public static void main(String[] args)
{
    System.out.println(euclidean(1068,342));
    System.out.println(school(1068,342));

}

public static int school(int m,int n){
    if(m<n)
    {
        int temp = m ;
        m = n;
        n = temp;
    }

    int factor = 2 , GCD = 1;
    int rootm =(int) Math.sqrt(m);
    while(factor<=rootm)
    {
        if(m%factor==0 && n%factor==0)
        {
            GCD*=factor;
            m = m/factor;
            n = n/factor;
            factor = 2;
            rootm =(int) Math.sqrt(m);

        }
        else
        factor++;
    }

    return GCD;
}

}