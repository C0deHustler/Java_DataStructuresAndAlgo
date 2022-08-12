import java.util.HashMap;
// Problem - https://www.interviewbit.com/problems/subarray-with-given-xor/
// Explanation - https://www.youtube.com/watch?v=lO9R5CaGRPY&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=26
// Also see dry run in register (small copy of software engineering)

// Time Complexity: O(N)
// Space Complexity: O(N)

public class Striver_CountSubArraysWithXORasK_OptimalApproach {
    public static int xor(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int prefix_xor = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            prefix_xor = prefix_xor ^ arr[i];
            int y = prefix_xor ^ k;

            if(map.get(y) != null){
                count += map.get(y);
            }
            if(prefix_xor == k){
                count++;
            }

            map.put(prefix_xor, (map.getOrDefault(prefix_xor, 0)) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 6, 4};
        int B = 6;

        int ans = xor(A, B);
        System.out.println(ans);
    }
}
