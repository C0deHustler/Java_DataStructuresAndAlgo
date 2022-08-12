import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/MAXIMUM
// Explanation - https://www.geeksforgeeks.org/given-an-array-arr-find-the-maximum-j-i-such-that-arrj-arri/

public class Prepbytes_Hard_FindMaximum_OptimalApproach {
    public static int max(int x, int y){
        return (x>y) ? x : y;
    }

    public static int min(int x, int y){
        return (x<y) ? x : y;
    }

    public static int maximumDifference(int[] a, int size){
        int[] RMax = new int[size];
        int[] LMin = new int[size];

        LMin[0] = a[0];
        for(int i=1; i<size; i++){
            LMin[i] = min(LMin[i-1], a[i]);
        }

        RMax[size-1] = a[size-1];
        for(int j=size-2; j>=0; j--){
            RMax[j] = max(RMax[j+1], a[j]);
        }

        int i=0;
        int j=0;
        int maxDiff = -1;

        while(i<size && j<size){
            if(LMin[i] < RMax[j]){
                maxDiff = max(maxDiff, j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumDifference(arr, n));
    }
}
