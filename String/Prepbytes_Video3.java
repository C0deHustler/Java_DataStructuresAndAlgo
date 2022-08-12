import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Prepbytes_Video3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //  String Immutability
        System.out.println("String Immutability :");
        String a = "Prepbytes";
        a.substring(0, 4);
        System.out.println(a);  //String is immutable, so still it is same as previous one

        String b = a.substring(0, 4);
        System.out.println(b);  // we need to store our modified string in a new string variable to print our modifications

        String c = a.toLowerCase();
        System.out.println(c);  // Similar concept of immutability applies here.
        String d = a.toUpperCase();
        System.out.println(d);  // Similar concept of immutability applies here.

        // String Builder
        System.out.println();
        System.out.println("String Builder :");
        StringBuilder str = new StringBuilder("Prepbytes");
        str.append("Rocks");
        System.out.println(str);    // PrepbytesRocks

        String string = new String("Placement");

        StringBuilder st = new StringBuilder(string);
        st.append("Manza");
        System.out.println(st); // PlacementManza

    }
}
