import java.util.ArrayList;
import java.util.List;
// Problem - https://leetcode.com/problems/letter-combinations-of-a-phone-number/

// Explanation - https://www.youtube.com/watch?v=tWnHbSHwNmA

public class LeetCode_Medium_LetterCombinationsOfAPhoneNumber {
    public static void solve(int index, String digits, String output, List<String> ans, String[] mapping){
        // base case
        if(index == digits.length()){
            ans.add(output);
            return;
        }

        int key = digits.charAt(index) - '0';   // E.g. Suppose digits = "23" and index = 0, so key = "2", and then converting it into "int" datatype
        String value = mapping[key];    // E.g. For key = 2, then value = "abc"

        // E.g. traversing over "abc"
        for(int i=0; i<value.length(); i++){
            output = output + value.charAt(i);  // first adding "a" in output, and in further recursive calls, it will become "ad","ae","af"
            solve(index + 1, digits, output, ans, mapping); // output is updated and "index" is moved on to next index
            // Backtracking
            output = output.substring(0, output.length() - 1);  // Suppose "a", recursive call made, then "ad", then backtracking done, then "a",
                                                                // now next recursive call made, then "ae", then backtracking....and so on
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if(digits.length() == 0){
            return ans;
        }

        String output = ""; // this output will be added in "ans" whenever we'll hit base case
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int index = 0;  // this index will traverse over "digits", i.e. if digit = "23", then index will 1st go to 2, then to 3.

        solve(index, digits, output, ans, mapping);
        return ans;
    }

    public static void main(String[] args) {
        String str = "23";
        List<String> ans = letterCombinations(str);
        System.out.println(ans);

        String str2 = "89";
        List<String> ans2 = letterCombinations(str2);
        System.out.println(ans2);
    }
}
