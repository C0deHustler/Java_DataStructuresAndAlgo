import java.util.*;
import java.io.*;
// https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
public class Prepbytes_Easy_FibonacciSeries {
    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        return (fib(n-1)+fib(n-2));
    }
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(fib(n));
        }

    }
}