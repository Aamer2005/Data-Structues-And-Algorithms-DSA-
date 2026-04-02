class Solution{

    public static void pattern(int size)
    {
        for(int line=1;line<2*size;line++){
            for(int symbol = 2*size ; symbol>=1;symbol--){
                if(line<=size){

                    if(symbol>2*size-line || symbol<=line)
                    System.out.print("*");
                    else 
                    System.out.print(" ");
                }
                else{
                    if(symbol>line || symbol<=2*size-line)
                    System.out.print("*");
                    else 
                    System.out.print(" ");
                }
            }
            
            System.out.println(line);
        }
    }
    public static void main(String[] args)
    {
        pattern(4);
    }
}