import java.util.Scanner;
import java.util.Stack;
// Problem - https://practice.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1/
// Explanation - https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/
// Explanation Video for Logic - https://www.youtube.com/watch?v=_PU5t-gk_B4
// Explanation Video for Code - https://www.youtube.com/watch?v=vq-nUF0G4fI&t=6s

public class GFG_Easy_InfixToPostfix {
    // Function for checking priority order of the operators so that they can be accordingly pushed and popped from the stack
    public static int precedence(char c){
        // In gfg problem, it has been mentioned that priority order -> ('^') > ('/' == '*') > ('+' == '-')
        switch(c){
            case '+':   // that's why we are giving same priority to + and -
            case '-':
                return 1;

            case '*':   // that's why we are giving same priority to * and /
            case '/':
                return 2;

            case '^':
                return 3;

        }
        return -1;
    }
    public static String infixToPostfix(String str){
        String res = "";    // result string that will hold final postfix expression
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){  // if ch is an operand('a','c','t',...), then just add it in the result
                res += ch;
            }
            else if(ch == '('){ // push the opening bracket
                st.push(ch);
            }
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){   // keep popping the top element from the stack until we encounter closing bracket,
                                                            // or the stack becomes empty
                    res += st.peek();
                    st.pop();
                }
                st.pop();   // we'll do 1 extra pop at the end, this extra pop will pop out the opening parenthesis left in the stack,
                            // since we cannot add parenthesis in the result, but they need to removed from the stack
            }
            else{
                while(!st.isEmpty() && precedence(ch) <= precedence(st.peek())){    // we'll check the priority of the operators
                    res += st.peek();
                    st.pop();
                }
                st.push(ch);    // finally, push the operator for which we did all that priority checking that whether it can be pushed into the
                                // stack or not.
            }
        }
        // now we've iterated our whole expression, but still of some operators are left in the stack, then we'll also add them in the result
        while(!st.isEmpty()){
            if(st.peek() == '('){
                return ("Invalid Expression");
            }
            else{
                res += st.peek();
                st.pop();
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();

            String ans = infixToPostfix(str);
            System.out.println(ans);
        }
    }
}
