import java.util.Scanner;

public class Prepbytes_Easy_MultiplyTwoNumbers_ParsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();

            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);

            int product = x*y;

            String ans = Integer.toString(product);
            System.out.println(ans);

        }
    }
}
