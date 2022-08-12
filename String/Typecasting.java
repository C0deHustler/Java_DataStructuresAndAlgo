import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 122;
        char ch = (char)a;
        System.out.println(ch);

        String x = "Ahmad";
        String y = "Hamza";


        boolean l = "Hamza".contains("Hamza");
        System.out.println(l);

        String k = "hamza";
        System.out.println(k.length());

        String p = "Kutta";
        System.out.println(p.substring(0,3));
        System.out.println(p.substring(2));

        StringBuilder q = new StringBuilder(p);
        System.out.println(q.append("Hamza"));

        int n = 3;
        int ans = n/10;
        System.out.println(ans);

        String s1 = "a";
        String s2 = "z";
        System.out.println(s1.compareTo(s2));

        String r = "abc";
        System.out.println(r.substring(1));

        System.out.println(7/2);
    }
}
