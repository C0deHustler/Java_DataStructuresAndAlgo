import java.util.*;

public class FunctionFactorial {

    public static void calculateFactorial(int n){
        if(n<0){ // since we cannot find factorial of a negative number
            System.out.println("Invalid number is selected.");
            return; // we'll return from here if negative value is entered
        }
        int factorial = 1;
        for(int i=n;i>=1;i--) {
            factorial *= i;
        }
        System.out.println(factorial+" ");
        return; // not necessary in the case of void i.e. code will work even if we don't write 'return'
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculateFactorial(n);
    }
}
