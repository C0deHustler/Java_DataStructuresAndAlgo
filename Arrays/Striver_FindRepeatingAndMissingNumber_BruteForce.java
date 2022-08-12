// Problem - https://takeuforward.org/data-structure/find-the-repeating-and-missing-numbers/
// Explanation - https://www.youtube.com/watch?v=5nMGY4VUoRY&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=4
// Brute Force - 1 : Sort the array, then traverse it, once we find 2 similar adjacent elements, it is the repeating element

// Brute Force - 2 : Using a frequency array
// T.C - O(n)
// S.C - O(n)
public class Striver_FindRepeatingAndMissingNumber_BruteForce {
    public static int[] solution(int[] arr){
        int[] ans = new int[2];

        int n = arr.length;
        // Frequency array
        int[] freq = new int[n + 1];

        // Increasing the count of elements in frequency array
        // Repeating element will get count == 2
        // Missing element will stay with count == 0

        // We could also have used boolean frequency array, initially all elements will be false
        // whenever we encounter any element, make it true
        // so if we encounter any element which is already true, it means it is repeating element, and we'll not change it to false,
        // we'll keep it as true, but will store this element in any variable
        // and after complete traversal, the element which will still be false, that will be our missing element
        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }

        int repeating = 0;
        int missing = 0;
        for(int i=0; i< freq.length; i++){
            if(freq[i] > 1){
                repeating = i;
            }
            if(freq[i] == 0){
                missing = i;
            }
        }

        ans[0] = repeating;
        ans[1] = missing;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 3};

        int[] ans;

        ans = solution(arr);
        System.out.println("Repeating element : "+ans[0]);
        System.out.println("Missing element : "+ans[1]);
    }
}
