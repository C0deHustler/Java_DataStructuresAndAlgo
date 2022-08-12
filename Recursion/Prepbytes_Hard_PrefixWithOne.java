import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/codingAssignment/PREFIX
// Explanation - https://www.youtube.com/watch?v=U81n0UYtk98
public class Prepbytes_Hard_PrefixWithOne {
    public static void prefixWithOne(String str, int zeroes, int ones, int n){
        if(n == 0){
            System.out.print(str+" ");
            return;
        }
        prefixWithOne(str+"1", zeroes, ones+1, n-1);

        if(ones > zeroes){  // Most Important Condition    (1's > 0's)Correct    (1's >= 0's)Wrong
            prefixWithOne(str+"0", zeroes+1, ones, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = "";

            prefixWithOne(str, 0, 0, n);
            System.out.println();
        }
    }
}
