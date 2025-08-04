class Solution {
    public static int GCD(int a, int b) {
        int q , r,result=1;
        while(a>0)
        {
            q = a/b;
            r = a%b;

            if(r==0)
            {
                result = b;
                break;
            }
            else
            {
                a = b;
                b = r;
            }
            
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(GCD(10,2));
    }
}