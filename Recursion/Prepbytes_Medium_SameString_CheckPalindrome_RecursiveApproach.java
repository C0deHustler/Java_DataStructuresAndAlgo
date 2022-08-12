import java.util.Scanner;
// https://www.studytonight.com/java-programs/java-program-to-check-palindrome-string-using-recursion

public class Prepbytes_Medium_SameString_CheckPalindrome_RecursiveApproach {

    public static boolean check(String str){
        if(str.length() == 0 || str.length() == 1){
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)) {
            return check(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            if(check(str)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
