// Problem - https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1#
// Problem - https://takeuforward.org/data-structure/count-inversions-in-an-array/

// Explanation - CPP Notes

// In GFG, code needs to be submitted in long datatype, so read that code also for understanding of use-case of different data types.
// Read the code to understand, where we'll use long and where we'll use int.

public class Striver_CountInversions {
    public static int merge(int[] arr, int start, int mid, int end){
        int inversion = 0;
        int left = mid - start + 1;
        int right = end - (mid+1) + 1;

        int[] leftArray = new int[left];
        int[] rightArray = new int[right];

        for(int i=0; i<left; i++){
            leftArray[i] = arr[start + i];
        }
        for(int i=0; i<right; i++){
            rightArray[i] = arr[mid+1 +i];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while(i<left && j<right){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightArray[j];
                inversion += left - i;
                j++;
                k++;
            }
        }
        while(i < left){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < right){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
        return inversion;
    }
    public static int mergeSort(int[] arr, int start, int end){
        int inversion = 0;

        if(start < end){
            int mid = start + (end - start)/2;

            inversion += mergeSort(arr, start, mid);
            inversion += mergeSort(arr, mid+1, end);

            inversion += merge(arr, start, mid, end);
        }
        return inversion;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 9, 1, 2, 7, 8};
        int n = arr.length;

        int ans = mergeSort(arr, 0, n-1);
        System.out.println(ans);
    }
}


