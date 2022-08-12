import java.util.Scanner;
import java.util.Stack;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/codingAssignment/PERSTR
// Explanation - https://medium.com/javarevisited/leetcode-1047-remove-all-adjacent-duplicates-in-string-solution-c3958131fc79
public class Prepbytes_Medium_PerfectString {

    public static String reverse(String str, int start, int end){
        char[] ch = str.toCharArray();
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
        return new String(ch);
    }

    public static String removeDuplicates(String str) {
        // It keeps all the elements in the stack
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            char cInverse ; // if c will be lowercase, then it will store uppercase of it and vice-versa
            if(Character.isLowerCase(c)){
                cInverse = Character.toUpperCase(c);
            }
            else{
                cInverse = Character.toLowerCase(c);
            }

            // If the top of the stack is equal to the current character we pop that element from the stack.
            if(!stack.isEmpty() && stack.peek() == cInverse){
                stack.pop();
            }
            // else we add that character into the stack
            else{
                stack.add(c);
            }
        }
        // We will store the characters in StringBuilder.
        StringBuilder sb = new StringBuilder("");
        while(!stack.isEmpty()){
            sb.append(stack.pop()); // since we're appending popped out elements of stack in the StringBuilder,
                                    // they will be appended in reversed form
        }
        // Transferring back data from StringBuilder to String
        String x = String.valueOf(sb);
        // Answer is in reversed form, so we will reverse it to get the appropriate answer,
        return reverse(x, 0, x.length()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            String ans = removeDuplicates(str);
            System.out.println(ans);
        }
    }
}