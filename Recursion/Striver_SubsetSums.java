import java.util.ArrayList;
// Problem - https://practice.geeksforgeeks.org/problems/subset-sums2234/1#

// Explanation - https://www.youtube.com/watch?v=rYkfBRtMJr8

public class Striver_SubsetSums {
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> result = new ArrayList<>();
        int n = N;

        solve(0, 0, result, arr, n);
        return result;
    }

    public static void solve(int index, int sum, ArrayList<Integer> result, ArrayList<Integer> arr, int n){
        if(index == n){
            result.add(sum);
            return;
        }

        solve(index+1, sum + arr.get(index), result, arr, n);

        solve(index+1, sum, result, arr, n);
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 1};
        int N = a.length;

        ArrayList<Integer> arr = new ArrayList<>();
        for(int ele: a){
            arr.add(ele);
        }

        ArrayList<Integer> ans = subsetSums(arr, N);
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
