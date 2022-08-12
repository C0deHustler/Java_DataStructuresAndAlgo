import java.util.*;
import java.io.*;

public class Prepbytes_Medium_AmanString {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            int count = 0;
            int n = str.length();

            for(int i=0; i<str.length(); i++){
                String x = str.substring(i);
                if(x.contains("aman")){
                    int index = x.indexOf("aman");
                    count += n-(i+(index+3));
                }
            }
            System.out.println(count);
        }
    }
}