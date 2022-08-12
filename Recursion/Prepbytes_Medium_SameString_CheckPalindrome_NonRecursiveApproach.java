import java.util.Scanner;

public class Prepbytes_Medium_SameString_CheckPalindrome_NonRecursiveApproach {
    public static String same(String str){
        int s = 0;
        int e = str.length()-1;
        while(s < e){
            if(str.charAt(s) != str.charAt(e)){
                return "No";
            }
            s++;
            e--;
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();

            System.out.println(same(str));
        }
    }
}
