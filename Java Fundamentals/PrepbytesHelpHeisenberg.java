import java.util.*;

public class PrepbytesHelpHeisenberg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long N  =sc.nextInt();  // In question, Constraints : 1 <= N <= 10^9, but the range of int is 2,147,483,647
                                             // so, prefer long

//        int sum = 0;
//        for(int i=1; i<=N; i++) {
//            sum += i;
//        }
        long sum = (N*(N+1))/2; // Standard formula for finding sum of N integers
        if(sum%2 == 0){
            System.out.println(0);
        }
        else {
            System.out.println(1);
        }
    }
}
