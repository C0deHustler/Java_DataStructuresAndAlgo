import java.util.Arrays;
// Time Complexity: O(n*log(n)) + O(n) + O(n)
// ( Sorting + traversal (putting elements from arr1 and arr2 to arr3) + traversal (putting elements from arr3 to arr1 and arr2))
// Space Complexity: O(n)

// Approach - Putting elements of arr1 and arr2 in a 3rd array (arr3), sort arr3, then again put sorted elements of arr3 into arr1 and arr2

public class Striver_MergeTwoSortedArrays_BruteForce {
    public static void sort(int[] arr1, int[] arr2, int n, int m){
        int[] arr3 = new int[n+m];
        int k = 0;

        // Putting unsorted elements of arr1 into arr3
        for(int i=0; i<n; i++){
            arr3[k++] = arr1[i];
        }
        // Putting unsorted elements of arr2 into arr3
        for(int i=0; i<m; i++){
            arr3[k++] = arr2[i];
        }

        // Sorting the array
        Arrays.sort(arr3);

        k = 0;
        // Putting back the sorted elements of arr3 back to arr1
        for(int i=0; i<n; i++){
            arr1[i] = arr3[k++];
        }
        // Putting back the sorted elements of arr3 back to arr2
        for(int i=0; i<m; i++){
            arr2[i] = arr3[k++];
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};

        int n = arr1.length;
        int m = arr2.length;

        sort(arr1, arr2, n, m);

        for(int ele: arr1){
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int ele: arr2){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
