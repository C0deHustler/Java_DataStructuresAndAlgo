// Problem - https://practice.geeksforgeeks.org/contest/the-easiest-ever-coding-challenge-3/problems#

public class GFG_Challenge_CompleteTheStaircase {
    public static int solve(int n) {
        int ans = 0;
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                n--;
                j++;
            }
            ans++;
            i++;
        }
        return ans;
    }

    // Demonstration of what happening in the problem for easy understanding
    public static void pattern(int n){
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print("X");
                n--;
                j++;
            }
            i++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = solve(n);
        System.out.println(ans);

        pattern(n);

        System.out.println();

        int n2 = 8;
        int ans2 = solve(n2);
        System.out.println(ans2);

        pattern(n2);
    }
}
