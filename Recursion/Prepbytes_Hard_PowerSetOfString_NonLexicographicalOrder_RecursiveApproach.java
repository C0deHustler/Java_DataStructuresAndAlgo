import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/codingAssignment/POWERLEX
// Explanation - https://www.youtube.com/watch?v=mEBEw_xScsE&t=864s

public class Prepbytes_Hard_PowerSetOfString_NonLexicographicalOrder_RecursiveApproach {
    public static void powerSet(String str, int index, String current){
        if(index == str.length()){
            System.out.println(current);
            return;
        }

        powerSet(str, index+1, current + str.charAt(index));
        powerSet(str, index+1, current);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        powerSet(s, 0, "");
    }
}
