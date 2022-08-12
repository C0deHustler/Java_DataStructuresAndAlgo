import java.util.HashSet;
// Problem - https://takeuforward.org/data-structure/length-of-longest-substring-without-any-repeating-character/
// Problem - https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Explanation - https://www.youtube.com/watch?v=qtVh-XEpsJo&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=27

// Time Complexity: O(N^2)
// Space Complexity: O(N) where N is the size of HashSet taken for storing the elements

public class Striver_LongestSubStringWithoutAnyRepeatingCharacter_BruteForce {
    public static int solve(String str){
        int maxLen = Integer.MIN_VALUE;

        for(int i=0; i<str.length(); i++){
            // Declaring set inside loop, so that each time we can get an empty new set for adding and characters traversed during running of 2nd loop
            HashSet<Character> set = new HashSet<>();

            for(int j=i; j<str.length(); j++){
                if(set.contains(str.charAt(j))){
                    maxLen = Math.max(maxLen, j - i);   // not doing "j - i + 1", because on dry run we can see, that on entering this loop,
                                                        // j is already standing at the repeating character, so j is already one step ahead,
                                                        // so no need to add 1 for compensation of 0-based indexing
                    break;
                }
                set.add(str.charAt(j));
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String str = "abcabcdaabb";

        int ans = solve(str);
        System.out.println("Length of longest substring without any repeating character is : "+ans);
        // 4 = "abcd"
    }
}
