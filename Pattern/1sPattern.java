class Solution{

    public static void allOnes(int size)
    {

        for(int line=1;line<=size;line++)
        {
            for(int ones = size ; ones>=1;ones--)
            {
                System.out.print("1 ");
            }
            System.out.println();
        }

    }
    public static void one234(int size)
    {
        for(int line=1;line<=size;line++)
        {
            for(int number=1;number<=size;number++)
            {
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
    public static void numbers(int size)
    {
        int count=1;
        for(int line=1;line<=size;line++)
        {
            for(int number=1;number<=size;number++)
            {
                if(count<10)
                System.out.print(count++ +"  ");

                // System.out.print(" "+count++ +" ");
                else if(count>=10)
                System.out.print(count++ +" ");


            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        // allOnes(4);
        one234(4);
        numbers(4);
    }
}