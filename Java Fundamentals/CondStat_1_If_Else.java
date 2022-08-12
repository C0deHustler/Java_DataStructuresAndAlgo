import java.util.*;
public class CondStat_1_If_Else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){     // Similarly we can take "if( x%2 == 0)" for checking even and odd
            System.out.println("Age is valid.");
        }
        else{
            System.out.println("Age is not valid");
        }
    }
}
