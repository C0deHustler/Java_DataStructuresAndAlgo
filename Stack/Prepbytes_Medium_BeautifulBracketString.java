import java.util.Scanner;
import java.util.Stack;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/codingAssignment/BTFBRAC
// Explanation - https://www.youtube.com/watch?v=-n_CsIL3Ts4

public class Prepbytes_Medium_BeautifulBracketString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        int count = 1;
        str = sc.next();

        while(!str.contains("-")){
            Stack<Character> st = new Stack<>();
            int open = 0;   // count of opening brackets
            int close = 0;  // count of closing brackets
            // Iterating the whole expression
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                // we will remove the count of the balanced expression and only keep the count of the unbalanced expression

                // under the if-else, we are just removing the set of balanced expressions, so that in  the end, we will be left with the count of
                // unbalanced open and close bracket
                if(ch == '{'){
                    st.push(ch);
                    open++;
                }
                else if(ch == '}' && !st.isEmpty() && st.peek() == '{'){
                    st.pop();
                    open--;
                }
                else{
                    close++;
                }
            }
            // see video for understanding this part
            // if count is even, then by just reversing half of the expressions, we will get our balanced expression

            if(open%2 != 0){    // if count is odd, then first we will make balanced expression as we did in the case of even,
                                // then we will add 1 extra, since this remaining open bracket will be reversed, and it will make a balanced expression
                                // with the help of reversal of the 1 extra close bracket existing in the close expression list
                open = (open/2)+1;  // number of reversals done
            }
            else{   // if count is even, then by just reversing half of the expressions, we will get our balanced expression
                open = open/2;  // number of reversals done
            }

            if(close%2 != 0){   // if count is odd, then first we will make balanced expression as we did in the case of even,
                                // then we will add 1 extra, since this remaining close bracket will be reversed, and it will make a balanced expression
                                // with the help of reversal of the 1 extra open bracket existing in the open expression list
                close = (close/2)+1;    // number of reversals done
            }
            else{   // if count is even, then by just reversing half of the expressions, we will get our balanced expression
                close = close/2;    // number of reversals done
            }

            int ans = open+close;
            System.out.println(count+". "+ans);

            count++;
            str = sc.next();    // special case for this type of problem where the while loop will run until or unless a special character
                                // e.g. "-" is encountered
        }
    }
}
