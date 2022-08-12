import java.util.Scanner;

public class Prepbytes_Hard_AddTwoNumericalStrings_ForLargeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        // Swapping if n1>n2
        if(str1.length() > str2.length()){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        // Reversing the string for doing addition in n1>n2 case
         str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        int n1 = str1.length();
        int n2 = str2.length();

        String res = "";
        int carry = 0;

        // Loop from 0 till n1-1
        for(int i=0; i<n1; i++){                                                                            // for char into int -> i-48 and for int into char -> (char)(i+48)
            int sum = ( (str1.charAt(i)-'0') + (str2.charAt(i)-'0') + carry);   // we are 1st accessing each char and converting char into int using ASCII technique i.e.(str1.charAt(i)-'0') or we can say [e.g. i=2 -> 50-48=2], ASCII for 0 is 48 and for 2 is 50 so 50-48 will give char 2
                                                                                                                   // and then 2nd, we are adding both int digit of str1 and str2 along with carry
                                                                                                                   // sum is storing int resultant of the addition
            res = res.concat(String.valueOf((char)(sum%10 + '0'))); // Since result has to be stored in String form, so we will concatenate our each individual sum,
                                                                                                       // we will convert int into char by using typecasting
                                                                                                       // sum%10 since we have to take only last digit of sum and the other digit of sum will go as carry
                                                                                                      // we will convert int digit into char digit by using ASCII technique i.e. (char)(sum%10 + '0') or we can say [e.g. i=1 -> (char)(1+48) = (char)49 -> char 1]
                                                                                                      // (char) is used to convert int to char
                                                                                                      // String.valueOf is used to convert char to string
            carry = sum/10; // to find carry
        }
        // Loop from n1 till n2-1
        for(int i=n1; i<n2; i++){
            int sum = ( ( str2.charAt(i)-'0') + carry); // only for str2 since n2 is the length of str2, and we will begin this traversing from n1 (which is the ending of str1)
            res = res.concat(String.valueOf((char)(sum%10 + '0')));
            carry = sum/10;
        }
        // If we are getting some value for carry then we need to add it also in the sum of our individual summation of digits
        if(carry > 0){
            res = res.concat(String.valueOf((char)(carry%10 + '0')));
        }
        //Reverse back the string by using StringBuilder once we get our final answer
        res = new StringBuilder(res).reverse().toString();
        System.out.println(res);
    }
}
