import java.util.*;
import java.lang.*;

public class Introduction3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Integer.parseInt() is used to convert a String into an integer
        String a = "123";
        int b = Integer.parseInt(a);
        System.out.println(b+7);

        //Integer.toString() is used to convert an integer to a String
        int x = 123;
        String y = Integer.toString(x);
        System.out.println(y+7);
    }
}
