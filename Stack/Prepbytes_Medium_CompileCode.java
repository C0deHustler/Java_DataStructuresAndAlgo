import java.util.*;
import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/codingAssignment/COMCODE
// Explanation - dry run code for understanding its logic

public class Prepbytes_Medium_CompileCode {
    static int top = -1;
    public static void push(String[] stack, char value, int n){
        if(top == n-1){
            System.out.println("Overflow");
            return;
        }
        top++;
        stack[top] = Character.toString(value);
    }
    public static int result(String[] stack, int n){
        int open = 0;
        int close = 0;
        int res = 0;

        for(int i=0; i<n; i++){
            if(open == close && stack[i].equals(">")){
                return res;
            }
            else if(stack[i].equals("<")){
                open++;
            }
            else{
                close++;
                if(open == close){
                    res = close * 2;
                }
            }
        }
        return  res;
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String[] stack = new String[n];

            String str = sc.next();
            for(int i=0; i<n; i++){
                char value = str.charAt(i);
                push(stack, value, n);
            }
            int ans = result(stack, n);
            System.out.println(ans);
            top = -1;
        }

    }
}