// Problem - https://leetcode.com/problems/sqrtx/
// Problem and Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/video/9a81874efe87459c92f3b12f3893dadf
// T.C - O(log n)

public class Prepbytes_SquareRootOfNumber_OptimalApproach {
    public static int solve(int x){
        if(x == 0 || x == 1){
            return x;
        }
        long start = 0;
        long end = x/2;
        int ans = 0;

        while(start <= end){
            long mid = (start + end)/2;

            if(mid * mid == x){
                return (int)mid;
            }
            else if(mid * mid < x){
                ans = (int)mid; // we'll keep storing mid in "ans", for those cases when we'll not find a perfect square root, but we would need
                                // to return the floor of the decimal square root
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 625;

        int ansA = solve(a);
        System.out.println(ansA);

        int ansB = solve(b);
        System.out.println(ansB);
    }
}
