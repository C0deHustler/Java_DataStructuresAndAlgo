import java.util.HashSet;
// Problem - https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1/#
// Explanation - https://www.youtube.com/watch?v=FEQSlOQa5po&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=29

// Sine all the elements inside a set are distinct, so with this property, we'll get our union of 2 arrays
public class GFG_Easy_UnionOfTwoArrays {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        int arr1[] = {7, 1, 5, 2, 3, 4};
        int arr2[] = {3, 8, 6, 4, 7, 1};

        int n1 = arr1.length;
        int n2 = arr2.length;

        for(int i=0; i<n1; i++){
            s.add(arr1[i]);
        }
        for(int i=0; i<n2; i++){
            s.add(arr2[i]);
        }

        System.out.println("Number of elements after union operation : "+s.size());

        System.out.println("Union array : ");
        for(int ele : s){
            System.out.print(ele+" ");
        }
    }
}
