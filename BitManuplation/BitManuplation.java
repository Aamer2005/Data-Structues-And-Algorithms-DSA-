class BitManuplation{
    public String decimalToBinary(int number)
    {
        int original = number;
        StringBuffer sb = new StringBuffer();


        if(original<0)
        {
            number=-number;
        }

        while(number>0)
        {
            sb.append(number%2);
            number = number/2;
        }

        sb.reverse(); 

        char temp;
        Integer[] array = new Integer[32];
        java.util.Arrays.fill(array,0);
        int carry=1;

        if(original<0) // for negetaive value
        {
            for(int i=31;sb.isEmpty()==false;i--) //taking 1 and 0's in array of size 32
            {
            temp = sb.charAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            array[i] = Integer.parseInt(temp+"");
            }

            for(int i=31;i>=0;i--)
            {
                array[i] = array[i]==0?1:0; //1's complement

                if(carry==1)    //2's complement
                {
                    if(array[i]==0)
                    {
                        array[i] =1;
                        carry=0;
                    }
                    else if(array[i]==1)
                    {
                        array[i] = 0;
                        carry=1;
                    }
                }
            }

            sb.append("0b");
            for(int i=0;i<32;i++)
            {
                sb.append(array[i]);
            }
            
        }

        return ""+sb;
    }

    public Integer binaryToDecimal(String bin)
    {
        Integer num = Integer.parseInt(bin,2,bin.length(),10);
        Integer result=0;
        int count=0;
        while(num>0)
        {
                result+=((int)Math.pow(2,count)*num%10);
                count++;
                num/=10;
        }

        return result;
    }

    public void swapWithoutTemp(int a , int b)
    {
        a = a ^ b;
        b = a ^ b ; //(a^b) ^ b -> a because b ^ b = 0
        a = a^b ; //(a^b) ^ b -> b because b = a now

        System.out.println(a + "\n" + b);
    }

    public boolean checkIBitSetOrNot(int number , int bit)
    {
        String str = Integer.toBinaryString(number);
        boolean result = true ;

        try{
        if(str.charAt(bit)=='1')
        result = true;
        else
        result = false;
        }
        catch(StringIndexOutOfBoundsException e)
        {
            result = false;
        }

        finally{
            return result;
        }
    }
}