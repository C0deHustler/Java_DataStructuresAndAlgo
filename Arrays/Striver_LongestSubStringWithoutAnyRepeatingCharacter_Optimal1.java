import java.util.HashSet;
// Problem - https://takeuforward.org/data-structure/length-of-longest-substring-without-any-repeating-character/
// Problem - https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Explanation - https://www.youtube.com/watch?v=qtVh-XEpsJo&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=27

// Time Complexity: O( 2*N ) (sometimes left and right both have to travel complete array)
// Space Complexity: O(N) where N is the size of HashSet taken for storing the elements

public class Striver_LongestSubStringWithoutAnyRepeatingCharacter_Optimal1{
    public static int solve(String str){
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = Integer.MIN_VALUE;

        for(int right = 0; right<str.length(); right++){
            // MaxLen will not be calculated inside this loop because here we're doing the task of removing repeating characters from the set,
            // and updating "left" and "right" accordingly
            if(set.contains(str.charAt(right))){
                while(left < right && set.contains(str.charAt(right))){
                    set.remove(str.charAt(left));
                    left++;
                }
            }
            // add the character in set if it does not exist in the set so far
            set.add(str.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "abcabcdaabb";

        int ans = solve(str);
        System.out.println("Length of longest substring without any repeating character is : " + ans);
        // 4 = "abcd"
    }
}
