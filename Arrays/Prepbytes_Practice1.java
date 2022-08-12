import java.util.*;

public class Prepbytes_Practice1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        a[0] = 22;
        a[1] = 33;
        System.out.println(a[0]);

        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println("Element "+i+" of your array :"+b[i]);
        }

    }
}
