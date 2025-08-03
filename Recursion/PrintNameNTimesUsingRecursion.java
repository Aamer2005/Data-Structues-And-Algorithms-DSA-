class Solution{
    public static void printName(String name , int time)
    {
        if(time==0)
        System.out.print(" ");
        else
        {
        System.out.println(name);
        printName(name,time-1);
        }
    }
    public static void main(String[] args)
    {
        printName("Hello World!!!",10);
    }
}