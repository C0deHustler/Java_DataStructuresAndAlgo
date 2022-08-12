import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/BOXES
// Explanation -
// The approach is quite simple as there are only two cases to cover.

// If minimum frequency between A and B is less than or equal to frequency of C, than minimum frequency between A and B is our answer,
// as Chocolate A and B are essential in every box so the minimum of these two will be the result.

// Else if minimum frequency between A and B is greater than frequency of C,
// this implies that putting only 1-1 chocolate A and chocolate B are not sufficient in each box as there are insufficient chocolate C for all such boxes.
// So, calculate the Sum of frequency of all the three boxes and divide it by 3.
// The minimum between this Sum and minimum frequency between A and B will be our answer.

public class Prepbytes_Hard_MaximizeTheBoxes_OptimalApproach {
    public static void max(int a, int b, int c){
        int min = Math.min(a, b);
        if(min <= c){
            System.out.println(min);
            return;
        }
        else if(min > c){
            int sum = (a+b+c)/3;
            System.out.println(Math.min(min, sum));
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            max(a, b, c);
        }
    }
}
