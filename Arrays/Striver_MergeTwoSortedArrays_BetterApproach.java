// Problem - https://takeuforward.org/data-structure/merge-two-sorted-arrays-without-extra-space/
// Explanation - https://www.youtube.com/watch?v=hVl2b3bLzBw&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=5
// Time complexity: O(n*m)
// Space Complexity: O(1)

// Insertion Sort Approach ( See in register )
public class Striver_MergeTwoSortedArrays_BetterApproach {
    public static void sort(int[] arr1, int[] arr2, int n, int m){
        int k = 0;
        for(int i=0; i<n; i++){
            // In each iteration, check whether elements of arr1 is greater than the 1st element of arr2, if yes, then swap
            if(arr1[i] > arr2[0]){
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }

            int first = arr2[0];
            // After swapping, sorted order of elements in arr2 will get disturbed, so we'll again sort the arr2 by making these rearrangements
            for(k = 1; k<m && arr2[k] < first; k++){
                arr2[k-1] = arr2[k];
            }
            arr2[k-1] = first;
        }
        // At the end, arr1 will be completely sorted and will have all the smaller elements of combined arr1+arr2 as per problem requirements,
        // and arr2 will be left with rest of the elements larger than sorted elements of arr1+arr2
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
