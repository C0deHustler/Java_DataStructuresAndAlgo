import java.util.*;

public class Prepbytes_Medium_FindTheMissing_BasicApproach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        for(int i=0; i<n-1; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag;   // initialize a flag
        // Loop for comparing elements from 1 to n
        for(int i=1; i<=n; i++){
            flag = false;   // Keep re-initializing flag as false because after each iteration of 2nd loop, flag will become true(i.e. element found), but in the question, we have to
                                   // find the missing element. Answer will only get printed if flag will be false(i.e. element not found)
            // Loop for comparing value of each element between 1 to n to each element of the array
            for(int j=0; j<n-1; j++){  // j=0 since it's an array and j<n-1 because n-1 is the size of the array.
                if(i == arr[j]){
                    flag = true;    // this means that element exists in the array
                    break;
                }
            }
            if(flag == false){  // when the element will not be found in the array, then the flag will remain false, and thus we will find our missing element and will print it.
                System.out.println(i);
                break;  // end this loop because we've found our missing element
            }
        }
    }
}
