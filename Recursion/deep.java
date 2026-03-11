class Solution{
    public static void main(String[] args)
    {
        //print(3);
        reverseprint(10);
    }

    public static void print(int x)
    {
        if(x>0)
        {
            System.out.print(1);
            print(x-1);
            System.out.print(2);
        }
    }

    public static void reverseprint(int x)
    {
        if(x>=1)
        {
            reverseprint(x-1);
            System.out.println(x);
        }
    }
}