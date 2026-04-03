class Heap{

    int[] arr = new int[20]; //to store values
    int size ;

    Heap(){
        size = 0;
        arr[0] = -1; //[-1 , el1 ,1l2]
    }

    void insert(int x){

        size = size+1;
        int index = size;

        arr[index] = x;
        while(index>1)
        {
            int parent = index/2;

            if(arr[parent]<arr[index]){
                swap(arr , parent,index);

                index = parent;
            }
            else{
                return;
        }
        }
    }


    void swap(int[] arr,int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j] ; 
        arr[j] = temp;
    }

    void print()
    {
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void main(String[] args){
        Heap h = new Heap();
        h.insert(60);
        h.insert(50);
        h.insert(40);
        h.insert(70);
        h.insert(10);
        h.insert(5);

        h.print();
    }
}