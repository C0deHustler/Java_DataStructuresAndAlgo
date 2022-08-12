import java.util.Scanner;
// https://www.geeksforgeeks.org/c-program-find-gcd-hcf-two-numbers/
public class Prepbytes_Easy_GCD_GreatestCommonDivisor {
    public static int gcd(int x, int y){
        if(x == 0){
            return y;
        }
        if(y == 0){
            return x;
        }
        // base condition
        if(x == y){
            return x;
        }

        if(x>y){
            return gcd(x-y, y);
        }
        else{
            return gcd(x, y-x );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
    }
}
