import java.util.*;
import java.io.*;

class Prepbytes_HouseNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- >0){
            int N = sc.nextInt();
            int sum = 0;

            for(int i=1; i<=N; i*=10){
                sum += (N-i+1);
            }
            System.out.println(sum);
        }
    }
}