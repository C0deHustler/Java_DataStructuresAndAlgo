import java.util.*;
// Problem - https://leetcode.com/problems/palindrome-partitioning/

// Explanation - https://www.youtube.com/watch?v=WBgsABoClE0&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=53

// Time Complexity: O( (2^n) *k*(n/2) )
// Reason: O(2^n) to generate every substring and O(n/2) to check if the substring generated is a palindrome.
// O(k) is for inserting the palindromes in another data structure, where k  is the average length of the palindrome list.

// Space Complexity: O(k * x)
// Reason: The space complexity can vary depending upon the length of the answer. k is the average length of the list of palindromes
// and if we have x such list of palindromes in our final answer. The depth of the recursion tree is n, so the auxiliary space required
// is equal to the O(n).

public class LeetCode_Medium_PalindromePartitioning {
    public static boolean isPalindrome(String str, int start, int end){
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void solve(int index, String str, List<String> path, List<List<String>> result){
        if(index == str.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=index; i<str.length(); i++){
            if(isPalindrome(str, index, i)){
                path.add(str.substring(index, i+1));
                solve(i + 1, str, path, result);
                path.remove(path.size() - 1);   // Backtracking
            }
        }
    }

    public static List<List<String>> partition(String str) {
        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();

        solve(0, str, path, result);
        return result;
    }

    public static void main(String[] args) {
        String str = "aabb";
        List<List<String>> ans = partition(str);
        System.out.println(ans);
    }
}
