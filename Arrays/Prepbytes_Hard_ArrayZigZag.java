import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/ARRZIGZAG
// Explanation - https://www.prepbytes.com/blog/arrays-interview-questions/array-zigzag/
public class Prepbytes_Hard_ArrayZigZag {

    static int minOperation(int[] array, int size, int start){
        int x = 0;
        int ans = 0;
        for(int i=start; i<size; i+=2){
            x = array[i];

            if(i>0){
                x = Math.min(x, array[i-1]-1);
            }
            if(i+1 != size){
                x = Math.min(x, array[i+1]-1);
            }
            ans += (array[i] - x);
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;

        evenCount = minOperation(arr, n, 0);
        oddCount = minOperation(arr, n, 1);

        System.out.println(Math.min(evenCount, oddCount));
    }
}