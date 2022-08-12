import java.util.Scanner;
import java.util.Stack;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/codingAssignment/INXPOX
// Explanation - https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/
// Explanation Video for Logic - https://www.youtube.com/watch?v=_PU5t-gk_B4
// Explanation Video for Code - https://www.youtube.com/watch?v=vq-nUF0G4fI&t=6s

public class Prepbytes_Medium_ConvertToPostfix {
    // Function for checking priority order of the operators so that they can be accordingly pushed and popped from the stack
    public static int precedence(char c){
        // In PrepBytes problem, it has been mentioned that priority order -> ('^') > ('/') > ('*') > ('+') > ('-')
        switch(c){  // so each operator will have its own priority
            case '+':
                return 1;
            case '-':
                return 2;

            case '*':
                return 3;
            case '/':
                return 4;

            case '^':
                return 5;

        }
        return -1;
    }
    // code deeply explained in GFG_Easy_InfixToPostfix.java
    public static String infixToPostfix(String str){
        String res = "";
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                res += ch;
            }
            else if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    res += st.peek();
                    st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && precedence(ch) <= precedence(st.peek())){
                    res += st.peek();
                    st.pop();
                }
                st.push(ch);
            }
        }
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
