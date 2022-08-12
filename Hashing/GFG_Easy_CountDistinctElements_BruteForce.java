// Problem - https://www.geeksforgeeks.org/count-distinct-elements-in-an-array/
// Code Explanation - https://www.geeksforgeeks.org/count-distinct-elements-in-an-array/
// video Explanation - https://www.youtube.com/watch?v=FEQSlOQa5po&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=28
// T.C - O(n^2)

public class GFG_Easy_CountDistinctElements_BruteForce {
    public static int findDistinct(int[] arr, int n){
        int res = 1;    // in the worst case also, array will have at least 1 distinct element
        for(int i=1; i<n; i++){ // i==1 (Important)
            int j;  // Declare j before 2nd for loop, because we'll check j with i after coming out of the 2nd for loop
            for(j=0; j<i; j++){ // j<i (Important)
                if(arr[i] == arr[j]){   // if we found a duplicate, then break
                    break;
                }
            }
            // if we'll find a duplicate, then our 2nd for loop will stop in between due to break, and then i will never be equal to j,
            // so res will not be incremented
            // but if we did not find any duplicate in 2nd for loop, it means distinct elements exits in that i to j range
            // since 2nd for loop will run till i ( j<i), so if we did not find any duplicate, then i == j after coming out of the 2nd for loop
            // so increment res
            // in short, if we're coming out of 2nd for loop after running all iterations, then it is confirmed that distinct element exists,
            // because if not, then we had left the 2nd for loop in between due to "break"
            if(i == j){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 5, 4, 5};
        int n = arr.length;

        int ans = findDistinct(arr, n);
        System.out.println("Number of distinct elements : "+ans);
    }
}
