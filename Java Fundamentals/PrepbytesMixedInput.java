import java.util.*;

public class PrepbytesMixedInput {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int intVar = sc.nextInt();
        float floatVar = sc.nextFloat();
        char charVar = sc.next().charAt(0);

        System.out.printf("%d$%.2f$%c", intVar, floatVar, charVar); // %d -> for formatting int
                                                                                                              // %.xf -> for formatting float and for specifying x decimal places after the point
                                                                                                               // Eg -> %.3f = 23.87654 -> 23.876
                                                                                                                // %c -> for formatting char
    }
}
