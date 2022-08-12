import java.util.Scanner;

// Java program to find the numbers of non-negative integral solutions
class Prepbytes_Hard_SolutionOfEquation {
    // return number of non-negative integral solutions
    public static int countSolutions(int n, int val) {
        // initialize total = 0
        int total = 0;
        // Base Case if n = 1 and val >= 0 then it should return 1
        if (n == 1 && val >= 0)
            return 1;
        // iterate the loop till it equals the val
        for (int i = 0; i <= val; i++) {
            // total solution of equations and again call the recursive function countSolutions(variable, value)
            total += countSolutions(n - 1, val - i);
        }
        // return the total no possible solution
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int val = sc.nextInt();

            System.out.print(countSolutions(n, val));
        }
    }
}