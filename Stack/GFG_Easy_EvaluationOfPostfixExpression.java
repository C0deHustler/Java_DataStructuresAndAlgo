import java.util.Scanner;
import java.util.Stack;
// Problem - https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1/#
// Logic and Video Explanation - https://www.youtube.com/watch?v=m7SGekhd1mQ
// Code Explanation - https://www.geeksforgeeks.org/stack-set-4-evaluation-postfix-expression/      Part-1

// This can only evaluate for those postfix where numbers range between 0 and 9 i.e. (0 <= number <= 9)
public class GFG_Easy_EvaluationOfPostfixExpression {
    public static int evaluate(int val1, int val2, int ch){
        int ans = 0;
        switch(ch){
            case '+':
                ans = val1 + val2;
                break;
            case '-':
                ans = val1 - val2;
                break;
            case '*':
                ans = val1 * val2;
                break;
            case '/':
                ans = val1 / val2;
                break;
        }
        return ans;
    }

    public static int evaluatePostFix(String str)
    {
        Stack<Integer> st = new Stack<>();

        int len = str.length();
        for(int i=0; i<len; i++) {
            char ch = str.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int val2 = st.pop();
                int val1 = st.pop();
                int ans = evaluate(val1, val2, ch);
                st.push(ans);
            }
            else {
                st.push(ch - '0');
            }
        }
        return st.pop();
    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int ans = evaluatePostFix(str);
        System.out.println(ans);
    }
}
