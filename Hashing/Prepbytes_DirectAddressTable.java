import java.util.Scanner;
// Like this, Direct Access Table works
public class Prepbytes_DirectAddressTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 1, 1, 4, 2, 2, 1, 1, 5, 5, 5, 6, 3, 2, 2, 3};

        int[] freq = new int[10];
        for(int i=0; i< arr.length; i++){
            freq[arr[i]]++;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i] != 0){
                System.out.println("Frequency of "+i+" is "+freq[i]);
            }
        }
    }
}
