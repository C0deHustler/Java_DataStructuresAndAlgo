import java.util.*;

public class Prepbytes_Medium_GreaterThanNeighbour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){

            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            boolean flag = false;

            for(int i=0; i<n; i++){

                if(i == 0){
                    if(arr[i] > arr[i+1]){
                        System.out.print(i+" ");
                        flag = true;
                    }
                }

                else if(i == n-1){
                    if(arr[n-1] > arr[n-2]){
                        System.out.print(i+" ");
                        flag = true;
                    }
                }

                else if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    System.out.print(i+" ");
                    flag = true;
                }

            }
            if(flag == false){
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
