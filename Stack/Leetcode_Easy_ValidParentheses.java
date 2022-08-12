// Problem - https://leetcode.com/problems/valid-parentheses/

public class Leetcode_Easy_ValidParentheses {
//class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> st = new Stack<>();
//        char ch = s.charAt(0);
//        if(ch == ')' || ch == '}' || ch == ']'){
//            return false;
//        }
//        for(int i=0; i<s.length(); i++){
//            ch = s.charAt(i);
//            if(ch == '(' || ch == '{' || ch == '['){
//                st.push(ch);
//            }
//            else if(!st.isEmpty() == true && ch == ')' && st.peek() == '('){
//                st.pop();
//            }
//            else if(!st.isEmpty() == true && ch == '}' && st.peek() == '{'){
//                st.pop();
//            }
//            else if(!st.isEmpty() == true && ch == ']' && st.peek() == '['){
//                st.pop();
//            }
//            else{
//                return false;
//            }
//        }
//        return st.isEmpty();
//    }
//}
}