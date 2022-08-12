// Problem - https://leetcode.com/problems/powx-n/
// Problem - https://takeuforward.org/data-structure/implement-powxn-x-raised-to-the-power-n/

// Explanation - https://www.youtube.com/watch?v=l0YC3876qxg&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=16
// T.C - O(log n)
// S.C - O(1)

// Focus on different data types and their typecasting
public class Striver_POW_x_n {
    public static double pow(double x, int n){
        double ans = 1.0;   // ans in double since our x is in double form, so our final answer will be of double form
        long nn = n;    // storing n in nn, so that if n would be -ve then we can convert it into +ve for doing operations
                        // and in the last we'll check whether our n was +ve or -ve to return actual answer
                        // we'll do all modifications on nn so that our actual n will remain unchanged to be checked at last

        // if nn is -ve, then convert it into +ve
        // Logic -> if n is +ve then do as usual operations, but if n is -ve then convert it into +ve and do all same operations
        // but in the last, ans = 1 / ans to get actual answer
        if(nn < 0){
            nn = -1 * nn;
        }

        // See video or dry run to understand this logic
        while(nn > 0){
            if(nn % 2 == 0){
                x = x * x;
                nn = nn / 2;
            }
            else{
                ans = ans * x;
                nn = nn - 1;
            }
        }

        // since our nn has been modified during operations, so we'll use our unmodified n to check whether n is -ve or +ve\
        // if -ve, then do ans = 1 / ans, since we know that 3 ^ (-4) = 1 / (3 ^ 4)
        if(n < 0){
            ans = (double) 1 / (double) ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        double x = 3.0;
        int n = -4;

        double result = pow(x, n);
        System.out.println(result);
    }
}
