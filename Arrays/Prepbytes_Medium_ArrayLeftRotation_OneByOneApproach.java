import java.util.*;

public class Prepbytes_Medium_ArrayLeftRotation_OneByOneApproach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int temp;
        // Loop will run d times since we will do one by one rotation d times
        for(int i=1; i<=d; i++){
            // Copy 1st element of array in a temporary variable
            temp = arr[0];
            // Loop for shifting all elements in the main array by one place
            for(int j=0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            // Pasting back that copied element to last position of the main array.
            arr[n-1] = temp;
        }
        // Printing the array
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

