import java.util.*;

public class PrepbytesSecondSmallest {
    public static void main(String[] rgs){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

        if( a>b && a>c){
            if(b>c) {
                System.out.println(b + " is the second largest number.");
            } else {
                System.out.println(c+" is the second largest number.");
            }
        }
        else if(b>a && b>c){
            if(a>c) {
                System.out.println(a + " is the second largest number.");
            } else {
                System.out.println(c+" is the second largest number.");
            }
        }
        else{
            if(a>b) {
                System.out.println(a + " is the second largest number.");
            } else {
                System.out.println(b+" is the second largest number.");
            }
        }
    }
}
