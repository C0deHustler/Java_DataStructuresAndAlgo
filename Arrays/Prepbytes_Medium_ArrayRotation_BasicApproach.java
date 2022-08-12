// Note - Wrong code explained in the video, so trust on this code and logic.

import java.util.*;

public class Prepbytes_Medium_ArrayRotation_BasicApproach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();   // d is the number of places after which rotation has to be done
        int[] temp = new int[d];    // temporary array of size d

        // Copying values from main array to temporary array
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        // Shifting elements from old position to the new position in the main array
        for(int i=0; i<n-d; i++){   // n-d because we will run this loop till n-d. For e.g. if n=6 (1,2,3,4,5,6) and d=2, then we will shift (3,4,5,6) to index i=0,1,2,3 respectively and stop
                                               // this shifting before i = n-d i.e. i = 6-2 = 4, because element 1 and 2 will be stored at i=4 and i=5 in further steps.
            arr[i] = arr[i+d];
        }

        int j=0;    // declaring j as it will act as an incrementer in the temp array
        // Again copying elements from temp array to the empty slots of the main array
        for(int i=n-d; i<n; i++){
            arr[i] = temp[j++];
        }
        // Printing of the array
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
