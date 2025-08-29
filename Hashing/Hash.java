class Hash{

int[] Hashnumber = new int[1000000];

public void HashingFunctionNumber(int[] array)
{
    for(int i=0;i<array.length;i++){
            Hashnumber[array[i]] +=1;
        }
}

public void HashingFunctionChar(String str)
{
    
} 

public int getHashValue(int key){

        return Hashnumber[key];
}

public static void main(String[] args)
{
    Hash h = new Hash();
    int[] array = {1,2,3,4,5,6,7,8,9,1,2,3,4,5};
    h.HashingFunctionNumber(array);

    System.out.println(h.getHashValue(1));
    System.out.println(h.getHashValue(4));

    System.out.println(h.getHashValue(7));

}

}