import java.util.HashMap;
// Problem - https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1/#
// Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/hashing/video/2bea85d1640944d8884869f1f22e0ec3

public class Prepbytes_SameSetOfElements {
    public static void main(String[] args) {
        int[] arr1 = {5, 7, 1, 2, 9, 5, 1};
        int[] arr2 = {9, 2, 1, 7, 5, 1, 5};
        int n = arr1.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Storing all elements of arr1[] as keys and their number of occurrences as values
        for(int i=0; i<n; i++){
            // if an element comes 1st time, then put its count as 1
            if(map.get(arr1[i]) == null){
                map.put(arr1[i], 1);
            }
            else{
                // if an element repeats, increment its count by 1
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }
        }

        boolean flag = true;
        // Now traversing arr2[] and comparing it with arr1[]
        for(int i=0; i<n; i++){
            // if an element of arr2[] does not exist in arr1[] i.e. in the map
            // if an element exists in arr1[], but does not exists in arr2[]
            if(!map.containsKey(arr2[i])){
                flag = false;
                break;
            }
            // if the count of an element in the map has already become equal to 0
            // i.e. if an element of arr2[] appears more times than it appears in arr1[]
            if(map.get(arr2[i]) == 0){
                flag = false;
                break;
            }
            // keep decrementing the count for similar elements of arr1[] and arr2[] in map
            map.put(arr2[i], map.get(arr2[i]) - 1);
        }
        if(flag){
            System.out.println("Same set of elements exists.");
        }
        else{
            System.out.println("Same set of elements does not exists.");
        }
    }
}
