import java.util.*;
import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/codingAssignment/MOMASS

public class Prepbytes_Hard_MassOfMolecules {
    public static int calculate(char ch){
        if(ch == 'C'){
            return 12;
        }
        else if(ch == 'O'){
            return 16;
        }
        else{
            return 1;
        }
    }

    public static int findMass(String str){
        int n = str.length();
        String check = "OCH";   // this will be used to check whether we encountered a character i.e. 'C', 'O' or 'H'

        Stack<String> stack = new Stack<>();    // Stack is of String datatype

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);

            if(ch == '('){
                // we're pushing "(" instead of '(', since stack is of String datatype
                stack.push("(");
            }
            // Checking whether ch is 'C' or 'O' or 'H'
            else if(check.contains(String.valueOf(ch))){
                // if yes, then we'll push molecular weight of that respective element i.e.
                // if 'C' -> push 12
                // if 'O' -> push 16
                // if 'H' -> push 1
                // but since stack is of String datatype, so we'll use String.valueOf
                stack.push(String.valueOf(calculate(ch)));
            }
            else if(ch == ')'){
                // it means that we'll now add all molecular mass values stored in stack until "(" is encountered
                int ans = 0;
                while(!stack.peek().contains("(")){
                    ans += Integer.parseInt(stack.pop());
                }
                stack.pop();    // 1 extra pop to remove "(" from stack
                stack.push(String.valueOf(ans));    // then again push the molecular mass calculated so far
            }
            // if we encounter a number
            else if(Character.isDigit(ch)){
                int ans = 0;
                if(!stack.isEmpty()){
                    // e.g. C2, then 1st C will be encountered and molecular mass of C i.e. 12 will go in the stack,
                    // then 2 will be encountered, and we'll multiply this 2 with stack.pop() i.e. 12
                    // ans = 12 * 2 = 24 (molecular mass of C2)
                    //         molecular mass           *            number encountered
                    ans = Integer.parseInt(stack.pop()) * Integer.parseInt(String.valueOf(ch));
                    stack.push(String.valueOf(ans));    // then again push the molecular mass calculated so far
                }
            }
        }

        int mass = 0;
        // Now stack is left with molecular masses of individual elements, add them all to get final answer
        while(!stack.isEmpty() && !stack.peek().contains("(")){
            mass += Integer.parseInt(stack.pop());
        }

        return mass;
    }

    public static void main(String args[]) throws IOException {
        String str1 = "CO2(H2)";
        String str2 = "COOH";
        String str3 = "CH";

        System.out.println("Molecular mass of CO2(H2) :"+findMass(str1));
        System.out.println("Molecular mass of COOH :"+findMass(str2));
        System.out.println("Molecular mass of CH :"+findMass(str3));

    }
}