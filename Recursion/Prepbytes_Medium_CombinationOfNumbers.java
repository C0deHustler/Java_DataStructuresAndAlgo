import java.util.Scanner;
// https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/video/0ecbde08013f45fda70b69faa17ba913
public class Prepbytes_Medium_CombinationOfNumbers {
    public static void method(int[] arr, int n, int k, int i, String ans){
        if(k == 0){
            System.out.println(ans);
            return;
        }
        for(int j=i; j<n; j++){
            method(arr, n, k-1, j+1, ans+arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        method(arr, n, k, 0, "");
    }
}
