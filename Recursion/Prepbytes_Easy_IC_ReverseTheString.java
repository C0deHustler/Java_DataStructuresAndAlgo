import java.util.*;
import java.io.*;
// https://mycode.prepbytes.com/problems/recursion/REVSTR
public class Prepbytes_Easy_IC_ReverseTheString {
    public static void reverse(String s){
        if(s == null || s.length() == 1){
            System.out.print(s);
            return;
        }
        System.out.print(s.charAt(s.length()-1));
        reverse(s.substring(0, s.length()-1));
    }
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            char[] ch = new char[n];
            for(int i=0; i<n; i++){
                ch[i] = sc.next().charAt(0);
            }
            String s = String.valueOf(ch);
            reverse(s);
            System.out.println();
        }

    }
}