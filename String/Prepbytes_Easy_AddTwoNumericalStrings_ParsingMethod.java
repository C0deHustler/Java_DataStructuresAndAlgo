import java.util.*;

public class Prepbytes_Easy_AddTwoNumericalStrings_ParsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input char as String datatype
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // Converting String into int
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        // Summing two int values
        int intSum = a+b;

        // Converting back int sum into String sum
        String stringSum = Integer.toString(intSum);

        System.out.println(stringSum);
    }
}
