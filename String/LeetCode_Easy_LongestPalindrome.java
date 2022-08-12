import java.util.*;
// Problem - https://leetcode.com/problems/longest-palindrome/

// Explanation - https://www.youtube.com/watch?v=J_Di2LmeLBQ

// Approach -
// 1. To form a palindrome, number of individual characters must be of same count and in same inverse order from the middle of the string
// 2. So, we'll count the number of each character of the string using a hash map,
// 3. since even count characters will obviously form palindrome, so we'll directly add count of even characters in our result
// 4. subtract 1 from count of odd characters, then it will become also even, and then also add this updated even count to result
// 5. In case of odd length palindrome, we need 1 unique character as our middle element of the string, so for that
// 6. we'll use "odd_found" variable to keep track whether we found any character with odd count, so that even performing step - 4,
// we can still use that 1 remaining character as our middle element, e.g. if count of 'a' = 5, -> 5 - 1 = 4, add this 4 in result,
// 7. but we've still got 1 'a' left, that 'a' can be used as middle element, so at last, if odd_found is true, then add 1 in final result
//
public class LeetCode_Easy_LongestPalindrome {
    public static int solve(String s) {

        // 2.
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int result = 0;
        boolean odd_found = false;

        for(int value : map.values()){
            // 3.
            if(value % 2 == 0){
                result += value;
            }
            // 4.
            else{
                // 5. and 6.
                odd_found = true;
                result += value - 1;
            }
        }

        // 7.
        if(odd_found){
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "abccccdd";

        int ans = solve(str);
        System.out.println(ans);
    }
}
