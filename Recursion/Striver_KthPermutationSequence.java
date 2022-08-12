import java.util.*;
// Problem - https://leetcode.com/problems/permutation-sequence/
// Problem - https://takeuforward.org/data-structure/find-k-th-permutation-sequence/

// Explanation - https://www.youtube.com/watch?v=wT7gcXLYoao&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=56

// See test case explanation from here - https://takeuforward.org/data-structure/find-k-th-permutation-sequence/

// Time Complexity: O(N) * O(N) = O(N^2)
// Reason: We are placing N numbers in N positions. This will take O(N) time. For every number, we are reducing the search space by removing
// the element already placed in the previous step. This takes another O(N) time.

// Space Complexity: O(N)
// Reason: We are storing  the numbers in a data structure(here List)

public class Striver_KthPermutationSequence {
    public static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;

        for(int i=1; i<n; i++){
            fact = fact * i;
            numbers.add(i); // if n=4, then List will become 1,2,3
        }
        numbers.add(n); // now list will be completed, i.e. 1,2,3,4

        String ans = "";
        k = k - 1;  // because we're following 0-based indexing

        while(true){
            ans = ans + numbers.get(k / fact);
            numbers.remove(k / fact);   // remove that number once added in the "ans"

            if(numbers.size() == 0){
                break;
            }

            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        String ans = getPermutation(n, k);
        System.out.println(ans);

        int n2 = 3;
        int k2 = 5;
        String ans2 = getPermutation(n2, k2);
        System.out.println(ans2);

        int n3 = 4;
        int k3 = 17;
        String ans3 = getPermutation(n3, k3);
        System.out.println(ans3);
    }
}
