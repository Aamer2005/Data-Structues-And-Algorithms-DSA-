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

    void delete()
    {

        if(size==0)return ;

        arr[1] = arr[size];
        arr[size] = 0;
        size--;
        

        int parent = 1;

        while(parent<size)
        {
            int left = 2*parent;
            int right = 2*parent+1;

            if(left<=size && arr[parent]<arr[left]){
                swap(arr,left,parent);
                parent = left;
            }
            else if(right<=size && arr[parent]<arr[right]){
                swap(arr,right,parent);
                parent = right;
            }
            else{
                return ;
            }
            System.out.println(parent);

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
        h.delete();

        h.print();
    }
}