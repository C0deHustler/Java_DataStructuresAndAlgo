import java.util.Scanner;

public class GCD_LCM_BasicApproach {
    public static int gcd(int x, int y){
        while(x % y != 0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }

    public static int lcm(int x, int y){
        return (x*y)/gcd(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }
}
