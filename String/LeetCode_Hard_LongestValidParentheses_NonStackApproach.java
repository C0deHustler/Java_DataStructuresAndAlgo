// Problem - https://leetcode.com/problems/longest-valid-parentheses/
// Explanation - https://www.youtube.com/watch?v=VdQuwtEd10M

// More optimal Approach than LeetCode_Hard_LongestValidParentheses_StackApproach.java in Stack folder
// since we're not using stack so space complexity is O(1)

// T.C - O(n)
// S.C - O(1)
public class LeetCode_Hard_LongestValidParentheses_NonStackApproach {
    public static int longestValidParentheses(String s) {
        int len = 0;
        int maxLen = 0;

        int open = 0;
        int close = 0;

        // Checking from left to right
        for(int i=0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }
            else{
                close++;
            }
            // If open==close, it means that so far we've encountered a valid parentheses, so store its length
            if(open == close){
                len = open + close; // open * 2 or close * 2 will also give same result as open + close
                maxLen = Math.max(maxLen, len);
            }
            else if(close > open){  // if we're moving from left to right, and we get many open brackets, but still there's hope that maybe these
                                    // opening brackets will get closed ahead till the end of string.
                                    // But if encounter more close brackets than open brackets while going from left to right,
                                    // then its confirm that these lesser number of open brackets will never get closed again,
                                    // so obviously it's an invalid parentheses
                open = close = 0;
            }
        }

        // Checking from right to left, so reset open and close to 0
        open = close = 0;
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }
            else{
                close++;
            }

            if(open == close){
                len = open + close;
                maxLen = Math.max(maxLen, len);
            }
            else if(open > close){  // here if open is greater than close, vice-versa logic as explained above
                open = close = 0;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str = ")()())";
        int ans = longestValidParentheses(str);
        System.out.println(ans);
    }
}
