// Problem - https://leetcode.com/problems/palindrome-number/

public class LeetCode_Easy_PalindromeNumber {
    class Solution {
        public boolean isPalindrome(int x) {
            String str = String.valueOf(x);
            char[] arr = str.toCharArray();

            int i = 0;
            int j = str.length()-1;

            while(i<=j){
                if(arr[i]==arr[j]){
                    i++;
                    j--;
                }
                else{
                    return false;
                }
            }
            return true;
        }
    }
}
