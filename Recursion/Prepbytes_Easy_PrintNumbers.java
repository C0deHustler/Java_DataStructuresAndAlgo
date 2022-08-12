import java.util.Scanner;

public class Prepbytes_Easy_PrintNumbers {
    public static void print(int a){
        if(a<0){
            return;
        }
        System.out.print(a+" ");
        print(a-1);

        System.out.print(a+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
