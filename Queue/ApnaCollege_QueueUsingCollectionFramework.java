import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ApnaCollege_QueueUsingCollectionFramework {
    public static void main(String[] args) {
        // Queue is an interface in Java,
        // Queue is not a class,
        // and objects can be made from classes only, not of interfaces
        // Queue interface is implemented with the help of 2 classes -
        // 1. LinkedList<>()
        // 2. ArrayDeque<>()
        // Both classes can be used for implementation, there is only a slight difference of cache used by both of them (Google it)

        // 1.
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(3);
        q1.add(5);
        q1.add(7);
        q1.add(9);
        while(!q1.isEmpty()){
            System.out.print(q1.peek()+" ");
            q1.remove();
        }
        System.out.println();

        // 2.
        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(2);
        q2.add(4);
        q2.add(6);
        q2.add(8);
        q2.add(10);
        while(!q2.isEmpty()){
            System.out.print(q2.peek()+" ");
            q2.remove();
        }
    }
}
