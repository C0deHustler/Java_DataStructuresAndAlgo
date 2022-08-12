// Problem - https://leetcode.com/problems/string-to-integer-atoi/
// Explanation - https://leetcode.com/problems/string-to-integer-atoi/discuss/1402936/JAVA-C%2B%2B-%3A-Simple-or-Pictorial-Explanation-or-32-bit-int-or-Easy

public class LeetCode_Medium_StringToInteger_atoi {
    public static boolean isDigit(char c){
        if(c - '0' >= 0 && c - '0' <= 9){
            return true;
        }
        return false;
    }

    public static int myAtoi(String str) {
        int len = str.length();
        if(len == 0){
            return 0;
        }

        int index = 0;
        while(index < len && str.charAt(index) == ' '){
            index++;
        }

        boolean isNegative = false;
        if(index < len && str.charAt(index) == '-'){
            isNegative = true;
            index++;
        }
        else if(index < len && str.charAt(index) == '+'){
            index++;
        }

        int result = 0;
        while(index < len && isDigit(str.charAt(index))){
            int digit = str.charAt(index) - '0';

            if(result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)){
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        String str1 = "234";
        int ans1 = myAtoi(str1);
        System.out.println(ans1);

        String str2 = "     -786";
        int ans2 = myAtoi(str2);
        System.out.println(ans2);

        String str3 = "555 is a good number";
        int ans3 = myAtoi(str3);
        System.out.println(ans3);

        String str4 = "What else can I do 2345";
        int ans4 = myAtoi(str4);
        System.out.println(ans4);
    }
}
