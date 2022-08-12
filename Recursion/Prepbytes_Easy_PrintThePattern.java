import java.util.Scanner;

public class Prepbytes_Easy_PrintThePattern {
    public static void print(int n){
        // PrintA
        System.out.print(n+" ");    // Print the number as soon as you enter the function

        if(n<=0){   // If number will get less than or equal to 0 then return the functions called recursively
            return;
        }
        print(n-5); // recursive call for subtracting 5 from n each time, when n is less than or equal to 0
        // PrintB
        System.out.print(n+" ");    // since this operation is after print(n-5), thus it will be executed once we hit our base condition, before hitting the base condition, output
                                                  // would be like -> 16, 11, 6, 1, -4
                                                  // at -4 (-4 <= 0), base condition will be hit, now we will start removing recursive function calls from the top of the recursive stack
                                                  // first we'll get print(1), and after that we will execute this PrintB and print 1                 Output- 16, 11, 6, 1, -4, 1
                                                 // then we'll get print(6), and after that we will execute this PrintB and print 6                 Output- 16, 11, 6, 1, -4, 1, 6
                                                 // first we'll get print(11), and after that we will execute this PrintB and print 11               Output- 16, 11, 6, 1, -4, 1, 6, 11
                                                // first we'll get print(16), and after that we will execute this PrintB and print 16               Output- 16, 11, 6, 1, -4, 1, 6, 11, 16
    }
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            print(n);
            System.out.println();
        }
    }
}
