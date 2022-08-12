// Problem - https://takeuforward.org/data-structure/find-the-repeating-and-missing-numbers/
// Problem - https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1/#
// Explanation - https://www.youtube.com/watch?v=qfbBRtbhQ04

// T.C - O(n)
// S.C - O(1)

public class  Striver_FindRepeatingAndMissingNumber_OptimalApproach {
    public static int[] solve(int[] arr, int n){
        int[] result = new int[2];
        int repeating = 0;
        int missing = 0;

        // we'll use the frequency array approach, but instead of creating a new array, we'll modify our original array
        // we'll use 1-based indexing
        // first we'll go to an element, and then we'll jump to the index similar to that element (if element = 2, then jump to index 2),
        // and make that newly visited element (element at index 2) as negative
        // this negative will inform that this element has already been visited
        // so if we again encounter any element which will be negative, it means that the index of that particular element will be our repeating element
        // in short, we are jumping from element to element via indexes (which are same as that of element)
        // so if we get a -ve element, it means that we've been sent to that element via an index, and since that particular index has again sent us
        // to that element again, it means that index is actually that element which is repeating i.e. exists 2 times in an array
        // and after finding our repeating element, we'll traverse the array once again, and we'll found 1 element as +ve
        // this will be the element which was not visited even once,   why ????
        // because the index which will sent us to this element does not exists, which actually means that this particular index will be the
        // missing element

        // Finding repeating element
        for(int i=0; i<n; i++){
            if(arr[Math.abs(arr[i]) - 1] < 0){  // doing this -1 to convert 1-based indexing into 0-based indexing
                repeating = Math.abs(arr[i]);
            }
            else{
                arr[Math.abs(arr[i]) - 1] = - arr[Math.abs(arr[i]) - 1];    // doing this -1 to convert 1-based indexing into 0-based indexing
            }
        }
        // Finding missing element
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                missing = i+1;  // adding 1 since we're following 1-based indexing for this whole approach, but in reality,
                                // array follows 0-based indexing
                break;
            }
        }
        result[0] = repeating;
        result[1] = missing;
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 3};
        int n = arr.length;

        int[] ans = solve(arr, n);
        System.out.println("Repeating element : "+ans[0]);
        System.out.println("Missing element : "+ans[1]);
    }
}