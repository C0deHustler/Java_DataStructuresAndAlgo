import java.util.Scanner;
// BINARY SEARCH APPROACH
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/MISSAP
// Explanation Article - https://www.geeksforgeeks.org/find-missing-number-arithmetic-progression/
// Explanation Video - https://www.youtube.com/watch?v=hw8pXjHcV2s
public class Prepbytes_Medium_MissingInAP_OptimalApproach {
    public static int findMissing(int[] arr, int low, int high, int diff){
        if(low >= high){     // it means no array exists, since for an AP, at least 2 elements should be there
            return -1;
        }
        int mid = low+(high-low)/2;

        if(arr[mid+1] - arr[mid] != diff){
            return (arr[mid]+diff);
        }
        if((mid>0) && (arr[mid] - arr[mid-1] != diff)){
            return (arr[mid-1]+diff);
        }
        if(arr[mid] == arr[0]+(diff*mid)){
            return findMissing(arr, mid+1, high, diff);
        }
        else{
            return findMissing(arr, low, mid-1, diff);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int commonDiff = (arr[n-1]-arr[0])/n;
            int ans = findMissing(arr, 0, n-1, commonDiff);
            System.out.println(ans);
        }
    }
}
