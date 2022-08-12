import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/queues/codingAssignment/STNNUM
public class Prepbytes_Easy_StoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while(t-- > 0){
            Queue<Integer> queue = new LinkedList<>();
            int n = scanner.nextInt();

            for(int i=1; i<=n; i++){
                queue.add(i);
            }

            while(queue.size() > 1){
                int x = queue.peek();
                queue.remove();
                queue.add(x);
                queue.remove();
            }
            System.out.println(queue.peek());
        }
    }
}
