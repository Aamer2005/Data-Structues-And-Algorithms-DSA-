import java.util.Arrays;

class HeapSort{

    private void Heapify(int[] arr , int i,int heapsize){

        int left = 2*i;
        int right = 2*i+1;
        int smallest=i;

        if(left<=heapsize && arr[left]<arr[smallest]){
            smallest = left;
        }
        if(right<=heapsize && arr[right]<arr[smallest]){
            smallest = right;
        }

        if(smallest!=i){
            swap(arr,i,smallest);
            Heapify(arr,smallest,heapsize);
        }

    }

    public void buildHeap(int[] arr , int heapsize){
        for(int i = heapsize/2;i>=1;i--){
            Heapify(arr,i,heapsize);
        }
    }
    public void HeapSort(int[] arr){

        int heapsize = arr.length-1;

        //building Heap
        buildHeap(arr , heapsize);

        //sort the array (heap elements)
        for(int i=heapsize;i>=2;i--){
            
            swap(arr , i,1);
            heapsize--;
            Heapify(arr,1,heapsize);
        }
    }

    private void swap(int[] arr , int i , int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

class Solution{

    public static void main(String[] args){
        HeapSort h = new HeapSort();

        int[] arr1 = {-1,1,3,2,4,5,3,7,6};
        h.buildHeap(arr1,arr1.length-1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {-1,1,3,2,4,5,3,7,6};
        h.HeapSort(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}