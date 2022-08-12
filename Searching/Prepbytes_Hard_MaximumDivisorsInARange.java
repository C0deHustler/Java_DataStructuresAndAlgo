import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/MAXDIV
// Explanation - https://www.prepbytes.com/blog/sorting-interview-programming/maximum-divisors-in-a-range/
// See rough notes for understanding lower bound and upper bound
// Please, please dry run lowerBound and upperBound function to understand
// if upperBound == lowerBound, then no common divisor exists, return -1.
// if upperBound != lowerBound, then answer is common factor present just before the upperBound
public class Prepbytes_Hard_MaximumDivisorsInARange {
    public static int GCD(int x, int y){
        while(x%y != 0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static int lowerBound(int a[], int start, int end, int key){
        // Lower bound is same as binary search, just return end, if(start>end)
        if (start > end)
            return end;
        int mid = (start + end) / 2;
        if (a[mid] == key)
            return mid;
        else if (a[mid] > key)
            return lowerBound(a, start, mid-1, key);
        else
            return lowerBound(a, mid+1, end, key);
    }
    public static int upperBound(int a[], int start, int end, int key){
        if (start > end)
            return start;
        int mid = (start + end) / 2;
        if (a[mid] == key)
            return upperBound(a, mid+1, end, key);
        else if (a[mid] > key)
            return upperBound(a, start, mid-1, key);
        else
            return upperBound(a, mid+1, end, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = GCD(a, b);

        int[] divisors = new int[9999999];
        int count = 0;
        for(int i=1; i<=gcd; i++){
            if(gcd % i == 0){
                divisors[count++] = i;
            }
        }

        int q = sc.nextInt();
        while(q-- > 0){
            int low = sc.nextInt();
            int high = sc.nextInt();

            int lb_index = lowerBound(divisors, 0, count-1, low);
            int ub_index = upperBound(divisors, 0, count-1, high);

            if(count == 0 || low > divisors[lb_index]){
                lb_index++;
            }
            int diff = ub_index - lb_index;
            if(diff == 0){
                System.out.println("-1");
            }
            else {
                System.out.println(divisors[ub_index - 1]);
            }
        }
    }
}