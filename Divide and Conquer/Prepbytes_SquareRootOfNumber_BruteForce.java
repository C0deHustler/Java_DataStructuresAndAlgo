// Problem and Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/video/5b2b23f08cc64d0d87dfc66f27dc802c
// T.C - O(under root of n)

public class Prepbytes_SquareRootOfNumber_BruteForce {
    public static int solve(int x){
        if(x == 0 || x == 1){
            return x;
        }
        int i = 1;
        while(i * i <= x){
            i++;
        }
        return i-1;
    }
    public static void main(String[] args) {
        int a = 64;
        int b = 144;

        int ansA = solve(a);
        System.out.println(ansA);

        int ansB = solve(b);
        System.out.println(ansB);
    }
}
