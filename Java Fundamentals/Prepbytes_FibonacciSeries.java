import java.util.*;

public class Prepbytes_FibonacciSeries {
    public static void fib(int n){
        int t1 = 0;
        int t2 = 1;
        int nextTerm;
        for(int i=0; i<=n; i++){
            System.out.print(t1+" ");
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
    }
}
