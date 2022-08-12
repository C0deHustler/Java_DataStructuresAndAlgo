import java.util.HashSet;
import java.util.Set;
// Problem - https://www.geeksforgeeks.org/count-distinct-elements-in-an-array/
// Code Explanation - https://www.geeksforgeeks.org/count-distinct-elements-in-an-array/
// video Explanation - https://www.youtube.com/watch?v=FEQSlOQa5po&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=28
// T.C - O(n)

// Use of HashSet -
// we will use this property of HashSet to get our answer :
// " As it implements the Set Interface, duplicate values are not allowed. "

public class GFG_Easy_CountDistinctElements_OptimalApproach {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();

        int[] arr = {5, 10, 15, 5, 4, 5};
        int n = arr.length;

        for(int i=0; i<n; i++){
            s.add(arr[i]);
        }

        System.out.println("Number of distinct elements : "+s.size());
    }
}
