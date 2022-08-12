import java.util.Scanner;
import java.util.Stack;

public class Prepbytes_Medium_EvaluateTheExpression {
    public static int evaluate(int val1, int val2, char c){
        int ans = 0;
        switch(c){
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

    public static int evaluatePostFix(String[] str, int n)
    {
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++) {
            char c = str[i].charAt(0);
            if(c == '+' || c == '-' || c == '*' || c == '/' ){
                int val2 = st.pop();
                int val1 = st.pop();
                int ans = evaluate(val1, val2, c);
                st.push(ans);
            }
            else {
                int x = Integer.parseInt(str[i]);
                st.push(x);
            }
        }
        return st.pop();
    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }

        int ans = evaluatePostFix(str, n);
        System.out.println(ans);
    }
}
