import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/MINUSPLUS
public class Prepbytes_Hard_PlusPlusIsMinus {   // Actually "MinusMinusIsPlus"
    public static void function(String s, String t){
        int i = 0;
        int j = 0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == '-' && t.charAt(j) == '-'){
                i++;
                j++;
            }
            else if(s.charAt(i) == '+' && t.charAt(j) == '+'){
                i++;
                j++;
            }
            else if(s.charAt(i) == '-' && s.charAt(i+1) == '-' && t.charAt(j) == '+'){
                i = i+2;
                j++;
            }
            else{
                break;
            }
        }
        if(i == s.length() && j == t.length()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x-- > 0){
            String s = sc.next();
            String t = sc.next();

            function(s, t);
        }
    }
}
