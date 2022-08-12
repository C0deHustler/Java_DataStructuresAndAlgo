import java.util.Scanner;

public class Prepbytes_Hard_MultiplyTwoStrings_ForLargeNumbers {

    // Even though this method is complicated than parsing method, but when digits or value of string is very large, then this method is useful
    public static String multiplyStrings(String num1, String num2){
        int len1 = num1.length();   // length of 1st number
        int len2 = num2.length();   // length of second number
        int[] res = new int[len1+len2]; // size of result array will be the sum of size of 1st and 2nd number
        int pf = 0; // power factor ( it will play a major role in getting final product in just a single array) See Pepcoding video

        int i = len2-1;
        while(i>=0){
            int iVal = num2.charAt(i) - '0';    // Number present at i
            i--;

            int carry = 0;  // carry will be set back to 0 after each iteration of i
            int k = res.length-1-pf;    // pf will increment after each iteration, thus value of k will reduce after iteration, here, k is kind of that cross mark which we make
                                                    // when we change line while doing multiplication roughly with pen and paper

            int j=len1-1;
            while(j>=0 || carry != 0){
                int jVal = j>=0 ? num1.charAt(j) - '0' : 0; // use of ternary operator, i.e. if j>=0 (i.e. running inside loop) them make j=num1.charAt(j)-'0' like we did in the case of i
                                                                                   // else put 0 at that place (E.g. 98*76, when we'll multiply 7 with 9, then we'll get 63, we'll store 3 in res array, will transfer 6 as carry
                                                                                  // since there is no multiplication after 7 * 9, so we will put jVal=0, thus iVal * jVal + carry -> 7 * 0 + 6 -> we will get 6.
                j--;

                int product = (iVal * jVal) + carry + res[k];   // See Pepcoding Video for clearing res[k] concept
                res[k] = product%10;
                carry = product/10;
                k--;
            }
            pf++;
        }
        // Management of leading zeros using general method
        String str = "";
        boolean flag = false;
        for(int val : res){ //https://www.javatpoint.com/java-for-loop
                                    // we have equalized res array with val, so we'll traverse val (i.e. res array), as explained in Pepcoding video, if array size is 6, but our answer if of 5 digit,
                                    // then this loop will handle that leading zero
            if(val==0 && flag==false){
                continue;
            }
            else{
                flag = true;
                str += val;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str1 = sc.next();
            String str2 = sc.next();

            String res = multiplyStrings(str1, str2);
            System.out.println(res);
        }
    }
}
