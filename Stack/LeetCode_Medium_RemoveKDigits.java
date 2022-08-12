import java.util.Stack;
// Problem - https://leetcode.com/problems/remove-k-digits/
// Explanation - Gallery Pics after Hashing Notes
// Explanation - Stack Live Session

public class LeetCode_Medium_RemoveKDigits {
    public static String removeK(String num, int k){
        // if we remove all the digits of the number
        if(k == num.length()){
            return "0";
        }
        // if we don't need to remove any digit
        if(k == 0){
            return num;
        }

        // making a StringBuilder because it has the ability to reverse, while String class does not have any method for reversing
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<num.length(); i++){
            char ch = num.charAt(i);

            if(stack.isEmpty() && ch == '0'){
                continue;
            }
            else{
                while(!stack.isEmpty() && k>0 && (stack.peek() - '0' > ch - '0')){
                    stack.pop();
                    k--;
                }
                if(stack.isEmpty() && ch == '0'){
                    continue;
                }
                else{
                    stack.push(ch);
                }
            }
        }

        while(!stack.isEmpty() && k > 0){
            stack.pop();
            k--;
        }
        if(stack.isEmpty()){
            return "0";
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }

        String result = ans.reverse().toString();
        return result;
    }
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;

        String ans = removeK(num, k);
        System.out.println(ans);
    }
}
