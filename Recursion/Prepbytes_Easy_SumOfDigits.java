import java.util.Scanner;
// https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
public class Prepbytes_Easy_SumOfDigits {
    public static int add(int n){
        if(n == 0){
            return 0;   // important point, we have to return 0,if n=12345, then ans will be like 0+1 -> 0+1+2 -> 0+1+2+3 -> 0+1+2+3+4 -> 0+1+2+3+4+5 = 15
        }
        return(n%10 + add(n/10));   // See stack visualization in register notes
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int ans = add(n);
            System.out.println(ans);
        }
    }
}
