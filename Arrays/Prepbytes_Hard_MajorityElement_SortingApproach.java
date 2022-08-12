import java.util.*;

public class  Prepbytes_Hard_MajorityElement_SortingApproach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i ++){
            arr[i] = sc.nextInt();
        }
        // In-Built function for sorting array
        Arrays.sort(arr);
        // Finding mid-element
        int midElement = arr[n/2];

        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == midElement){
                count++;
            }
        }
        if(count > n/2){
            System.out.println("Majority element is : "+midElement);
        }
        else{
            System.out.println("There is no Majority Element.");
        }
    }
}
