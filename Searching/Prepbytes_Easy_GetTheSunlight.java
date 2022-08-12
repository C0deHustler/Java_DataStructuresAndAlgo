import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/FACESUN
public class Prepbytes_Easy_GetTheSunlight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            int max = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                if(arr[i] > max){
                    count++;
                    max = arr[i];
                }
            }
            System.out.println(count);
        }
    }
}
