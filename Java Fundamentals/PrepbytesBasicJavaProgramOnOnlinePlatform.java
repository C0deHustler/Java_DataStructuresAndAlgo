import java.util.*;

public class PrepbytesBasicJavaProgramOnOnlinePlatform {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int a = sc.nextInt();
            double b = sc.nextInt();

            System.out.println((a+b)+" "+(a-b)+" "+(a*b));
            t--;
        }
    }
}
