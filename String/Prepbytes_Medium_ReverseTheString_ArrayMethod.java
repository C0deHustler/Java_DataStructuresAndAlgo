import java.util.Scanner;

public class Prepbytes_Medium_ReverseTheString_ArrayMethod {
    public static void reverse(char[] a, int s, int e){
        while(s < e) {
            char temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  =sc.next();
        char[] ch = s.toCharArray();

        reverse(ch, 0, ch.length-1);
        String ans = new String(ch);
        System.out.println(ans);
    }
}
