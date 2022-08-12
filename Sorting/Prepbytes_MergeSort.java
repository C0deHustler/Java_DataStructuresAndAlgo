import java.util.Scanner;
// Complete explanation in C++ notes and CPP code
// Problem - https://leetcode.com/problems/sort-an-array/

public class Prepbytes_MergeSort {

    public static void merge(int[] arr, int start, int mid, int end){
        int left = mid - start +1;
        int right = end - (mid+1) + 1;

        int[] leftArray = new int[left];
        int[] rightArray = new int[right];

        for(int i=0; i<left; i++){
            leftArray[i] = arr[start+i];
        }
        for(int i=0; i<right; i++){
            rightArray[i] = arr[mid+1 + i];
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
    }

    public static void mergeSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start+(end-start)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
