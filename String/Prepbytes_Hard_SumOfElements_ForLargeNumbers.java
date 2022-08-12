import java.util.*;
import java.io.*;

public class Prepbytes_Hard_SumOfElements_ForLargeNumbers {

    public static String sumOfElements(String a, String b){
        if(a.length() >b.length()){
            String temp = a;
            a = b;
            b = temp;
        }

        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();

        int n1 = a.length();
        int n2 = b.length();

        String result = "";
        int carry = 0;

        for(int i=0; i<n1; i++){
            int sum = (a.charAt(i)-'0') + (b.charAt(i)-'0') + carry;
            result = result.concat(String.valueOf((char)(sum%10 +'0')));
            carry = sum/10;
        }

        for(int i=n1; i<n2; i++){
            int sum = (b.charAt(i)-'0') + carry;
            result = result.concat(String.valueOf((char)(sum%10 + '0')));
            carry = sum/10;
        }

        if(carry > 0){
            result = result.concat(String.valueOf((char)(carry%10 + '0')));
        }

        result = new StringBuilder(result).reverse().toString();

        return result;
    }
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.next();
            }

            String ans = arr[0];
            for(int j=1; j<n; j++){
                ans = sumOfElements(ans, arr[j]);
            }
            System.out.println(ans);
        }
    }
}
