import java.util.*;

public class PrepbytesSecondSmallestMethod_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if((x>y && x<z) || (x<y && x>z)){
            System.out.println(x+" is the second smallest number.");
        }
        else if((y>x && y<z) || (y<x && y>z)){
            System.out.println(y+" is the second smallest number.");
        }
        else{
            System.out.println(z+" is the second smallest number.");
        }
    }
}
