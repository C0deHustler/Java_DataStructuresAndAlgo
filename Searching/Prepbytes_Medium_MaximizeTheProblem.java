import java.util.Scanner;

public class Prepbytes_Medium_MaximizeTheProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();

        int limit = 240 - k;
        int time = 0;
        int count = 0;
        for(int i=1; i<=n; i++){
            time += 5*i;
            if(time > limit){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
