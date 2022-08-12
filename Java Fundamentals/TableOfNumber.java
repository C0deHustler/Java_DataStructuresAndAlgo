import java.util.*;
public class TableOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int product = 1;
        for(int i=1;i<11;i++){
            product = n*i;
            System.out.println(product);
        }
    }
}
