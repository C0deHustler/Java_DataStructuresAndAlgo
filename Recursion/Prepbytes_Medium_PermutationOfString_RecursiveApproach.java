import java.util.Scanner;
// https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
public class Prepbytes_Medium_PermutationOfString_RecursiveApproach {
    public static void permutation(String str, String answer){
        if(str.length() == 0){
            System.out.print(answer+" ");
            return;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left_Substring = str.substring(0, i);
            String right_Substring = str.substring(i+1);
            String result = left_Substring + right_Substring;

            permutation(result, answer+ch);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String answer = "";

        permutation(str, answer);
    }
}
