import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/video/36c435a18de14cbfa20d8807f3ece093
public class Prepbytes_BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=n-1; i>=0; i--){
            int flag = 0;   // Optimization
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;   // flag will be updated if swapping happens, and it shows that array is unsorted, and it needed to get sorted in further iterations
                }
            }
            if(flag == 0){  // if flag has not updated, then rray is already sorted, no need to do further iterations and break from here
                break;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
