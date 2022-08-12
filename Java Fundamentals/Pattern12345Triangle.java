import java.util.*;

public class Pattern12345Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = 5;

        // For Loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // While Loop
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print(j+" ");
                j++;
            }
            i++;
            System.out.println();

        }
    }
}