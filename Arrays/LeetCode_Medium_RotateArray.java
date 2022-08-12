import java.util.*;
// Problem - https://leetcode.com/problems/rotate-array/
// Explanation - https://www.youtube.com/watch?v=8RErc0VXAo8

// Also known as Reversal Algo

// T.C - O(n)
// S.C - O(1)
public class LeetCode_Medium_RotateArray {
    static void reverse(int a[], int start, int end){
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int k){
        k = k % arr.length;
        int n = arr.length;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3;

        rotate(arr, k);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
