import java.util.*;

public class WhileLoopPractice_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;
        while(count <= n){
            System.out.print(count+" ");
            if(count%5 == 0){
                System.out.println();
            }
            count++;
        }
    }
}
