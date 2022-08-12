import java.util.*;

public class Prepbytes_IterationStatement_CodingExercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int operationNumber;
        do {
            System.out.println("List of operations : \n 1. Addition \n 2.Subtraction");
            System.out.println("Select a valid operation : ");
            operationNumber = sc.nextInt();

            switch (operationNumber) {
                case 1:
                    System.out.println("Enter two numbers to add : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Addition : " + (a + b));
                    break;
                case 2:
                    System.out.println("Enter two numbers to subtract : ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("Subtraction : " + (x - y));
                    break;
                default:
                    System.out.println("Invalid operation number entered.");
            }
            System.out.println("Do you again want to perform the operation : (Y/N)");
            ch = sc.next().charAt(0);
        } while(ch == 'Y');
    }
}
