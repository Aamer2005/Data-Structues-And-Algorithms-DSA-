import java.util.PriorityQueue;
import java.util.Queue;


class PQ{

    public static void main(String[] args){


        //Min Heap PQ
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.add(10);
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());
        pq.add(0);
        System.out.println(pq.peek());

        //Max Heap 
        Queue<Integer> mpq = new PriorityQueue<>((a,b)-> b-a);
        mpq.add(2);
        mpq.add(3);
        mpq.add(1);
        mpq.add(10);
        mpq.add(0);
        System.out.println("mpq : "+mpq.peek());
    }
}