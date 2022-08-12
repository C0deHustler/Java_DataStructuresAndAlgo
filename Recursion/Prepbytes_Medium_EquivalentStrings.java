import java.util.Scanner;
// Detailed explanation in Prepbytes_Easy_Equivalent.java of Divide and Conquer Module
public class Prepbytes_Medium_EquivalentStrings {
    public static String recSort(String s){
        if(s.length() % 2 != 0){
            return s;
        }
        String s1 = recSort(s.substring(0, s.length()/2));
        String s2 = recSort(s.substring(s.length()/2));

        if(s1.compareTo(s2) < 0){
            return s1+s2;
        }
        else{
            return s2+s1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = "abaa";
        String b = "aaab";

        a = recSort(a);
        b = recSort(b);

        if(a.equals(b)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
