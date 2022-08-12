import java.util.*;

public class PrepbytesIntegerOverflow {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int a = 100000*100000;  // This (int * int) result will be out of int range
        System.out.println(a);

        long b = 100000*100000; // This (int * int) result will also be an int and it cannot be stored into a long
        System.out.println(b);

        long c = (long)100000*100000;   // This (long * int) result will become a long because it is the more dominating datatype and
                                                             // the output will be stored into a  long
        System.out.println(c);

        long d = (long)(10000*100000);  // This (int * int) result will be an int and also inside the range of int, and then it will be converted
        System.out.println(d);                 // into long and will also be stored into a long

        long e = (long)(100000*100000); // This (int * int) result will be an int and lies outside the range of int, and then it will not be converted
        System.out.println(d);                  // and will cause an error
    }
}
