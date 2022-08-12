import java.util.Scanner;

public class Prepbytes_Easy_ReverseTheString {
    void reverse(String s){
        if(s == null || s.length() == 1){
            System.out.println(s);
        }
        else{
            System.out.print(s.charAt(s.length()-1));
            reverse(s.substring(0, s.length()-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Prepbytes_Easy_ReverseTheString obj = new Prepbytes_Easy_ReverseTheString();
        obj.reverse(str);
    }
}
