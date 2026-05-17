class Solution
{
    static public void printBinary(int digit , String soFar){

        if(digit == 0)
        System.out.println(soFar);
        else
        {
            printBinary(digit-1 , soFar+"0");
            printBinary(digit-1 , soFar+"1");
        }

    }

    public static void main(String[] args)
    {
        printBinary(2,"");

    }

}