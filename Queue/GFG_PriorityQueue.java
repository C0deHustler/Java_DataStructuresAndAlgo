import java.util.Collections;
import java.util.PriorityQueue;

public class GFG_PriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();  // Minimum element will be returned by PriorityQueue by default
        pq.add(30);
        pq.add(28);
        pq.add(6);
        pq.add(24);
        pq.add(14);
        pq.add(19);

        System.out.println("Min-Heap - ");
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
            System.out.println(pq);
            System.out.println();
        }


        // // Maximum element will be returned by PriorityQueue when we'll use Collections.reverseOrder()
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.add(30);
        pq2.add(28);
        pq2.add(6);
        pq2.add(24);
        pq2.add(14);
        pq2.add(19);

        System.out.println("Max-Heap :");
        while(!pq2.isEmpty()){
            System.out.println(pq2.poll());
            System.out.println(pq2);
            System.out.println();
        }
    }
}
