import java.util.*;
import java.io.*;

public class Prepbytes_FascinatingNumber {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            int temp1 = N+1;
            int temp2 = N+1;

            while(true){

                int a = temp1%10;
                temp1 /= 10;
                int b = temp1%10;
                temp1 /= 10;
                int c = temp1%10;
                temp1 /= 10;
                int d = temp1%10;

                if((a!=b)&&(a!=c)&&(a!=d)&&(b!=c)&&(b!=d)&&(c!=d)){
                    System.out.println(temp2);
                    break;
                }
                else{
                    temp2 = temp2+1;
                    temp1 = temp2;
                }
            }
        }

    }
}