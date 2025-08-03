//Factorial of N numbers

class Solution{
    public static int getFactorial(int num)
    {
        if(num>1)
        {
            return num*getFactorial(num-1);
        }
            else if(num==1 || num==0)
        return 1;
        else
            return -1;
    }
}