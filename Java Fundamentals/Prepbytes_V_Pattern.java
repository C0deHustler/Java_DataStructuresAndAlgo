import java.util.*;
import java.io.*;

public class Prepbytes_V_Pattern {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int spaces = 8;
        for(int i=1; i<=5; i++){

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            spaces = spaces-2;
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}