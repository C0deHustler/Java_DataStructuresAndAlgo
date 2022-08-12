import java.util.Scanner;
// https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/video/e8f2b9f3ee594be59ff2985b6799740f
public class Prepbytes_Hard_CombinationOfFactors {
    public static void solve(int n, int p, String str){
        // Base Condition
        if(n == 1){
            System.out.println(str);
        }
        else{
            for(int i=p; i<=n; i++){    // start with p as 2, but keep incrementing it if it is unable to divide the dividend
                if(n%i == 0){   // if the dividend is getting by the divisor
                    solve(n/i, i,str+" "+i);    // recursive call for further continuing this same division method
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int p = 2;
            String str = "1";

            solve(n, p, str);
        }
    }
}
