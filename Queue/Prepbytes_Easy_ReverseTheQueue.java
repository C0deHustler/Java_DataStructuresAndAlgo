import java.util.*;
import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/queues/codingAssignment/RVRSEQU
// Explanation - https://www.geeksforgeeks.org/reversing-a-queue-using-another-queue/
public class Prepbytes_Easy_ReverseTheQueue {

    public static Queue<Integer> reverse(Queue<Integer> queue){
        Queue<Integer> ans = new LinkedList<>();
        int s = queue.size();
        for(int i= 0; i<s; i++){
            for(int j=0; j < queue.size()-1; j++){
                int x = queue.peek();
                queue.remove();
                queue.add(x);
            }
            ans.add(queue.peek());
            queue.remove();
        }
        return ans;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                queue.add(x);
            }

            queue = reverse(queue);

            while(!queue.isEmpty()){
                System.out.print(queue.peek()+" ");
                queue.remove();
            }
            System.out.println();
        }

    }
}