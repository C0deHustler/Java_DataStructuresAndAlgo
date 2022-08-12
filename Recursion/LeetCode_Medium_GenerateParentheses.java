import java.util.ArrayList;
import java.util.List;
// Problem - https://leetcode.com/problems/generate-parentheses/
// Explanation - https://www.youtube.com/watch?v=eyCj_u3PoJE&t=231s
// Must see video at 23:20 to understand recursive tree

public class LeetCode_Medium_GenerateParentheses {
    public static void solve(int open, int close, String output, List<String> ans){
        if(open == 0 && close == 0){
            ans.add(output);
            return;
        }

        // Till the time we have open brackets, we can use them, because in all possible cases, those opening brackets will eventually get closed
        // by the closing brackets once open will become 0, and we'll be left with no other choice than using close brackets
        if(open != 0){
            String output1 = output;    // copy the latest generated output in output1, and then
            output1 = output1 + "(";    // do operations on it
            solve(open - 1, close, output1, ans);   // and pass this output1 as argument, also reduce number of open brackets
        }

        if(close > open){
            String output2 = output;    // same logic as above
            output2 = output2 + ")";
            solve(open, close - 1, output2, ans);
        }
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String output = "";
        int open = n;
        int close = n;

        solve(open, close, output, ans);
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> ans = generateParenthesis(n);
        System.out.println(ans);
    }
}
