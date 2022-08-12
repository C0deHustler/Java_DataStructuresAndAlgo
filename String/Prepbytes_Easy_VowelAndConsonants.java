import java.util.*;
import java.io.*;

class Prepbytes_Easy_VowelAndConsonants {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();

            int v = 0;
            int c = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                    v++;
                }
                else{
                    c++;
                }
            }
            System.out.println(v+" "+c);
        }

    }
}