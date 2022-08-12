import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/queues/codingAssignment/ENDEQ
public class Prepbytes_Easy_EnqueueAndDequeue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            queue.add(arr[i]);
            for(Integer ele : queue) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            queue.remove();
            for(Integer ele : queue) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
