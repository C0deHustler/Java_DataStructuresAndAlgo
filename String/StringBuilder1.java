import javax.print.DocFlavor;
import java.util.*;

public class StringBuilder1 {
    public static void main(String[] args){
        // Declaration of StringBuilder
        StringBuilder sb = new StringBuilder("Hamza");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'Z');
        System.out.println(sb);

        // Insert char at index 0
        sb.insert(0, 'A');
        System.out.println(sb);
        sb.insert(2, 'x');
        System.out.println(sb);

        // Delete a char between a given range
        sb.delete(1, 3); // ending index is exclusive i.e. for i=0 to 4, it will execute operation between i=0 to 3.   
        System.out.println(sb);

         // Append Function
        StringBuilder ahk = new StringBuilder("C");     // In case of Strings ;
        ahk.append("a");        // str = str + "a";
        ahk.append("p");        // str = str + "p";
        ahk.append("t");        // str = str + "t";
        ahk.append("a");        // str = str + "a";
        ahk.append("i");        // str = str + "i";
        ahk.append("n");        // str = str + "n";
        System.out.println(ahk);

        // Length of the string
        System.out.println(ahk.length());
    }
}
