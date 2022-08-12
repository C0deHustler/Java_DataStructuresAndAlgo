import java.util.*;

class Prepbytes_Hard_MajorityElement_BasicApproach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i ++){
            arr[i] = sc.nextInt();
        }

        int maxCount = 0;
        int index = 0;

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                // update maxCount if count of
                // current element is greater
                if(count > maxCount){
                    maxCount = count;
                    index = i;  // important point
                }
            }
        }
        // if maxCount is greater than n/2
        // return the corresponding element
        if(maxCount > n/2){
            System.out.println("The majority element is : "+arr[index]);
        }
        else{
            System.out.println("No majority element exists.");
        }
    }
}