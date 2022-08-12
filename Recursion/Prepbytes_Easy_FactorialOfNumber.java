import java.util.*;
import java.io.*;

public class Prepbytes_Easy_FactorialOfNumber {
    public static long fact(long n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextInt();

            long ans = fact(n);
            System.out.println(ans);
        }

    }
}