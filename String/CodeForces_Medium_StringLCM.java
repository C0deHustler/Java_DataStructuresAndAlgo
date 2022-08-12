import java.util.Scanner;

// https://codeforces.com/problemset/problem/1473/B
// Logic explanation in gallery pics (after Recursion 1st video notes)
public class CodeForces_Medium_StringLCM {
    public static int gcd(int x, int y){
        while(x%y != 0){
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
        int q = sc.nextInt();
        while(q-- > 0){
            String s = sc.next();
            String t = sc.next();

            int s_length = s.length();
            int t_length = t.length();

            int lcm_length = lcm(s_length, t_length);

            int x = lcm_length / s_length;
            int y = lcm_length / t_length;

            if(s.repeat(x).equals(t.repeat(y))){
                System.out.println(s.repeat(x));
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
