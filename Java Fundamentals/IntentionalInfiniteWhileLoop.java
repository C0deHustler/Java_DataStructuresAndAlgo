import java.util.*;

public class IntentionalInfiniteWhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            char ch = sc.next().charAt(0);
            System.out.println(ch+" ");
            if(ch == 'k'){
                break;
            }
        }
    }
}
