import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/video/25fbdab701ff4aadbe616bca583818ab
// Explanation - https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/

// Difference between Mamta Mam and GFG logic is this -> if array is 50, 60, 70, 80, 90, 10, 20, 30, 40, then for Mamta Mam (Pivot is 10),
// For GFG (Pivot is 90)

// and GFG code has handled all <, <=, ==, >, >= more optimally
// So refer GFG for optimal code, and Mamta Mam Gallery Pics Notes for concept understanding

// T.C - O(log n) , binary search
// S.C - O(1)

public class Prepbytes_Hard_SortedAndRotatedArraySearching {

    public static int binarySearch(int[] arr, int start, int end, int key){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;  // Better way to avoid integer overflow
        if(arr[mid] == key){
            return mid;
        }
        else if(arr[mid] > key){
            return binarySearch(arr, start, mid-1, key);
        }
        else{
            return binarySearch(arr, mid+1, end, key);
        }
    }

    public static int findPivot(int[] arr, int start, int end){
        if(start > end){
            return -1;
        }
        if(start == end){
            return start;
        }
        int mid = (start+end)/2;
        if((mid < end) && (arr[mid] > arr[mid+1])){
            return mid;
        }
        if((mid > start) && (arr[mid-1] > arr[mid])){
            return mid-1;
        }
        if(arr[start] < arr[mid]){
            return findPivot(arr, mid+1, end);
        }
        else{
            return findPivot(arr, start, mid-1);
        }
    }

    public static int findKey(int[] arr, int key){
        int n = arr.length;
        int pivot = findPivot(arr, 0, n-1);

        // Write next 6 lines always in this order, else runtime error will come in some test cases
        if(pivot == -1){
            return binarySearch(arr, 0, n-1, key);
        }
        if(arr[pivot] == key){
            return pivot;
        }

        if(arr[0] <= key){
            return binarySearch(arr, 0, pivot-1, key);
        }
        else{
            return binarySearch(arr, pivot+1, n-1, key);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int key = 0;

        int ans = findKey(arr, key);
        System.out.println(ans);
    }
}

