import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

// This code is incomplete

public class Striver_4Sum_BruteForce {
    public static boolean binarySearch(int[] arr, int start, int end, int target){
        if(start <= end){
            return false;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return true;
        }
        else if(arr[mid] > target){
            return binarySearch(arr, start, mid, target);
        }
        else{
            return binarySearch(arr, mid+1, end, target);
        }
    }

    public static ArrayList<ArrayList<Integer>> sum(int[] arr, int target){
        int n = arr.length - 1;
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int x = target - (arr[i] + arr[j] + arr[k]);
                    if(binarySearch(arr, k+1, n, x)){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        list.add(x);
                        Collections.sort(list);
                        ans.add(list);
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;

        ArrayList<ArrayList<Integer>> ans = sum(arr, target);

        System.out.println(ans);
    }
}
