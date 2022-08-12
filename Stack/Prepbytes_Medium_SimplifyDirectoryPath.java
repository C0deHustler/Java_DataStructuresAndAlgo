import java.util.Scanner;
import java.util.Stack;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/codingAssignment/DIRPTH
// Logic Video Explanation - https://www.youtube.com/watch?v=qYlHrAKJfyA
// Code Video Explanation - https://www.youtube.com/watch?v=aNONtwL2T60
// Code Explanation - https://www.geeksforgeeks.org/simplify-directory-path-unix-like/

public class Prepbytes_Medium_SimplifyDirectoryPath {

    public static String directoryPath(String str){
        Stack<String> st = new Stack<>();
        int len = str.length();

        for(int i=0; i<len; i++){
            String temp = "";

            // continue if we encounter a '/', because we'll add these '/' by ourselves when we'll print final answer
            if(str.charAt(i) == '/'){
                continue;
            }

            // if we encounter anything except '/', then just add it in the temp string, and use while loop to keep adding such characters
            // e.g. abc, xyz, .., a, c......
            while(i < len && str.charAt(i) != '/'){
                temp += str.charAt(i);
                i++;
            }

            // we will not do anything in stack if we encounter this, since '.' means current directory
            if(temp.equals(".")){
                continue;
            }
            // we will pop out the top of the stack if we get '..', since '..' means go back to parent directory, so we'll pop out the topmost element
            else if(temp.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            // if temp is not '.' or '..', then just push it in the stack
            else{
                st.push(temp);
            }
        }

        String res = "";
        while(!st.isEmpty()){
            res = "/" + st.peek() + res;    // "/" we'll add by ourselves to get answer in standard form
            st.pop();
        }
        if(res.length() == 0){
            res = "/";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        String ans = directoryPath(str);
        System.out.println(ans);
    }
}
