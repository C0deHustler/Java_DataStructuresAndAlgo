import java.util.ArrayList;
// Problem - https://leetcode.com/problems/reverse-pairs/
// Problem - https://takeuforward.org/data-structure/count-reverse-pairs/

// Explanation - https://www.youtube.com/watch?v=S6rsAlj_iB4&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=20

// Time Complexity : O( N log N ) + O (N) + O (N)
// Reason : O(N) – Merge operation , O(N) – counting operation ( at each iteration of i , j does not start from 0 . Both of them move linearly )

// Space Complexity : O(N)
// Reason : O(N) – Temporary ArrayList

public class Striver_ReversePairs {
    public static int merge(int[] arr, int start, int mid, int end){
        int count = 0;
        int j = mid + 1;

        for(int i=start; i<=mid; i++){
            while(j <= end && arr[i] > (2 * arr[j])){
                j++;
            }
            count += j - (mid+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        int left = start;
        int right = mid+1;

        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                list.add(arr[left++]);
            }
            else{
                list.add(arr[right++]);
            }
        }
        while(left <= mid){
            list.add(arr[left++]);
        }
        while(right <= end){
            list.add(arr[right++]);
        }

        for(int i=start; i<=end; i++){
            arr[i] = list.get(i - start);
        }

        return count;
    }

    public static int countPairs(int[] arr, int start, int end){
        if(start >= end){
            return 0;
        }

        int mid = start + (end - start)/2;
        int inversion = 0;

        inversion = countPairs(arr, start, mid);
        inversion += countPairs(arr, mid+1, end);

        inversion += merge(arr, start, mid, end);

        return inversion;
    }

    public static void main(String[] args) {
        int[] arr1 = {40, 25, 19, 12, 9, 6, 2};
        int[] arr2 = {1, 3, 2, 3, 1};

        int ans1 = countPairs(arr1, 0, arr1.length-1);
        System.out.println(ans1);

        int ans2 = countPairs(arr2, 0, arr2.length-1);
        System.out.println(ans2);
    }
}
