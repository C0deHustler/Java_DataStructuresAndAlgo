import java.util.Scanner;
// https://www.youtube.com/watch?v=SwPXgTiv8Ag
public class Prepbytes_Medium_BinaryAddition {
    public static String addBinaryStrings(String x, String y){
        int i = x.length()-1;
        int j = y.length()-1;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum += x.charAt(i--) - '0';
            }
            if(j>=0){
                sum += y.charAt(j--) - '0';
            }
            carry = (sum>1) ? 1 : 0;
            res = res.append(sum%2);
        }
        if(carry != 0){
            res = res.append(carry);
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();

            String ans = addBinaryStrings(a, b);
            System.out.println(ans);
        }
    }
}
