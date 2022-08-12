import java.lang.*;
public class Prepbytes_Video1 {
    public static void main(String[] args){
        // Different methods of String declaration
        System.out.println("String Declaration different methods:");
        // Method-1
        String a = "Prepbytes 1";
        System.out.println(a);
        // Method-2
        String b = new String("Prepbytes 2");
        System.out.println(b);

        // Method-3
        char ch[] = {'p', 'r', 'e', 'p', 'b', 'y', 't', 'e', 's','3'};
        String c = new String(ch);
        System.out.println(c);

        // Method-4
        StringBuilder d = new StringBuilder("Prepbytes 4");
        System.out.println(d);

        // Method-5
        String e = new String(d);
        System.out.println(e);

        System.out.println();
        // Concatenation
        System.out.println("String Concatenation:");
        String msg1 = "Conca";
        String msg2 = "tenation";
        String message = msg1+msg2;
        System.out.println(message);

        int rollNo = 256;
        String message2 = msg1+msg2+rollNo;
        System.out.println(message2);

        System.out.println();

        // String Length
        System.out.println("Checking for String Length:");
        String first = "Prepbytes";
        int length1 = first.length();
        System.out.println(length1);

        String second = new String("Prepbytes");
        int length2 = second.length();
        System.out.println(length2);

        System.out.println();
        // String Equality
        System.out.println("Checking for String Equality :");
        String s1 = "Prepbytes";
        String s2 = new String("Prepbytes");
        System.out.println(s1==s2); // false
        System.out.println(s1=="Prepbytes");    // true

        System.out.println(s1.equals(s2));  // true //Strings Equality Method

        String s3 = "Prepbytes";
        String s4 = new String("PREPBYTES");

        System.out.println(s3.equals(s4));  // false
        System.out.println(s3.equalsIgnoreCase(s4));    // true

        System.out.println(s1.equals("Prepbytes")); // true


    }
}
