import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/queues/codingAssignment/BINQUE

// Logic + Code Video Explanation - https://www.youtube.com/watch?v=osF7tb10cUA&t=570s  (With proper animation)

public class Prepbytes_Medium_BinaryQueue {
    public static void generateBinary(int n){
        Queue<String> q = new LinkedList<>();

        q.add("1");
        for(int i=0; i<n; i++){
            String ans = q.peek();  // storing the peek in ans
            q.remove(); // then removing the peek
            System.out.print(ans+" ");  // and printing the ans

            String str1 = ans+"0";  // adding 0 in the ans (i.e. the peek which we stored in the ans earlier)
            String str2 = ans+"1";  // adding 1 in the ans (i.e. the peek which we stored in the ans earlier)

            // adding those strings in the queue
            q.add(str1);
            q.add(str2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            generateBinary(n);
            System.out.println();
        }
    }
}
