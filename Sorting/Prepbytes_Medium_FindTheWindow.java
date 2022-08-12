import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/codingAssignment/WINDOW
// Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/video/522195cf81f94d589273c9470d19accc
// and gallery notes
public class Prepbytes_Medium_FindTheWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int x;  // index of the 1st unsorted element from start
            int y;    // index of the 1st unsorted element from the end
            for(x=0; x<n-1; x++){   // start < n-1 to avoid runtime error because we're doing arr[start+1] inside for loop
                if(arr[x] > arr[x+1]){  // break as soon as we find the index of the 1st unsorted element from the start
                    break;
                }
            }
            for(y=n-1; y>0; y--){     // end > 0 to avoid runtime error because we're doing arr[end-1] inside for loop
                if(arr[y-1] > arr[y]){    // break as soon as we find the index of the 1st unsorted element from the end
                    break;
                }
            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            // Running loop between x and y i.e. the unsorted array
            for(int i=x; i<=y; i++){  // i=start and i<=end because x and y are inclusive
                if(arr[i] < min){
                    min = arr[i];   // finding min element between x and y
                }
                if(arr[i] > max){
                    max = arr[i];      // finding max element between x and y
                }
            }
            // Checking if x need to be updated
            for(int i=0; i<x; i++){
                if(arr[i] > min){
                    x = i;
                }
            }
            // Checking if y needs to be updated
            for(int i=y; i<n; i++){
                if(arr[i] < max){
                    y = i;
                }
            }
            System.out.println(x+" "+y);
        }
    }
}
