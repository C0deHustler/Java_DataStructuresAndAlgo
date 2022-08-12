import java.util.*;
import java.io.*;

public class Prepbytes_Easy_PrintPrefixAndSuffix {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // String prefix = new String();
        String prefix = "";

        for(int i=0; i<s.length(); i++){
            prefix += s.charAt(i);
            System.out.println(prefix);
        }

        // String suffix = new String();
        String suffix = "";

        for(int i=(s.length())-1; i>=0; i--){
            suffix = s.charAt(i) + suffix;
            System.out.println(suffix);
        }
    }
}