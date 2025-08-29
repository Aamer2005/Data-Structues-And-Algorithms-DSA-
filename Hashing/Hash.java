class Hash{

int[] Hashnumber = new int[1000001];
int[] Hashchar = new int[26];

public void HashingFunctionNumber(int[] array)
{
    for(int i=0;i<array.length;i++){
            Hashnumber[array[i]] +=1;
        }
}

public void HashingFunctionChar(String str)
{
    char c = ' ';

        for(int i=0;i<str.length();i++)
        {
            c = str.charAt(i);

            Hashchar[c-65] +=1;
        }
} 

public int getHashValue(int key ){

        return Hashnumber[key];
}

public int getHashValue(char c)
{
        return Hashchar[c-65];
}

public static void main(String[] args)
{
    Hash h = new Hash();
    int[] array = {1,2,3,4,5,6,7,8,9,1,2,3,4,5};
    h.HashingFunctionNumber(array);

    System.out.println(h.getHashValue(1));
    System.out.println(h.getHashValue(4));
    System.out.println(h.getHashValue(7));

    String str = "HELLOWORLD";
    h.HashingFunctionChar(str);
    System.out.println(h.getHashValue('H'));
    System.out.println(h.getHashValue('L'));
    System.out.println(h.getHashValue('O'));
}

}