import java.util.*;
// Problem - https://leetcode.com/problems/longest-valid-parentheses/
// Explanation - https://www.youtube.com/watch?v=VdQuwtEd10M

// Less optimal Approach than LeetCode_Hard_LongestValidParentheses_NonStackApproach.java in String Folder
// since we're using stack so space complexity is O(n)

// T.C - O(n)
// S.C - O(n)

// See video for logic understanding

public class LeetCode_Hard_LongestValidParentheses_StackApproach {

    public static int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int len = 0;
        int maxLen = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    len = i - st.peek();
                    maxLen = Math.max(maxLen, len);
                }
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
