class CharHash{

int[] Hashchar = new int[256];

public void HashingFunctionChar(String str)
{
    char c = ' ';

        for(int i=0;i<str.length();i++)
        {
            c = str.charAt(i);

            Hashchar[c] +=1;
        }
} 

public int getHashValue(char c)
{
        return Hashchar[c];
}

public static void main(String[] args)
{
    CharHash h = new CharHash();

    String str = "Hello World Earth 123123";
    h.HashingFunctionChar(str);
    System.out.println(h.getHashValue('H'));
    System.out.println(h.getHashValue('l'));
    System.out.println(h.getHashValue('1'));
    System.out.println(h.getHashValue(' '));
}
}