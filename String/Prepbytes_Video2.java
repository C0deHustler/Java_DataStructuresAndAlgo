import java.util.*;
import java.lang.*;

public class Prepbytes_Video2 {
    public static void main(String[] args){
        // Strings Pool
        System.out.println("String Pool");
        String s1 = "Prepbytes";
        String s2 = "Prepbytes";

        if(s1==s2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

        String s3 = new String("Prepbytes");
        if(s1==s3){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

        // String Join
        System.out.println();
        System.out.println("String Join");

        String abc = String.join("&","PREP", "by", "tes");
        System.out.println(abc);

        String date = String.join("/", "12", "11", "2013");
        System.out.println(date);

        // String Methods
        System.out.println();
        System.out.println("String Methods");

        String x = "Prepbytes";
        String y = x.substring(0, 4);
        System.out.println(y);

        String z = x.replace("b", "z");
        System.out.println(z);

        String l = x.toUpperCase();
        System.out.println(l);

        String m = x.toLowerCase();
        System.out.println(m);

        // Character Extraction
        System.out.println();
        System.out.println("Character Extraction");

        char ch;
        ch = "Prepbytes".charAt(5);
        System.out.println(ch);

        String n = "Prepbytes";
        char[] arr = new char[10];
        n.getChars(4, 9, arr, 3);

        for(int i=0; i<10; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        char array[] = n.toCharArray();
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

        // Searching Strings
        System.out.println();
        System.out.println("Searching Strings");

        String w = "Hi How are you ?";
        System.out.println(w.indexOf('H')); //start to end
        System.out.println(w.lastIndexOf('H')); //end to start
        System.out.println(w.indexOf('H', 5));  //start to end, starting from index 5
        System.out.println(w.lastIndexOf('y', 5));  //end to start, starting from index 5
    }
}
