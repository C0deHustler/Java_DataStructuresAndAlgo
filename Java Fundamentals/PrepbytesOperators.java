import java.util.*;

public class PrepbytesOperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>y){
            System.out.println(x+" is greater than "+y+".");
        }
        else if(x<y){
            System.out.println(y+" is greater than "+x+".");
        }
        else{
            System.out.println("Both are equal.");
        }
    }
}
