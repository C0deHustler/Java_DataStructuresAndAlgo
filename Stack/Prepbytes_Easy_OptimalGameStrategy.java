import java.util.Scanner;
import java.util.Stack;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/codingAssignment/OPLGMSTG
public class Prepbytes_Easy_OptimalGameStrategy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for(int i=0; i<n ;i++){
            int a = sc.nextInt();
            s1.push(a);
            s2.push(a);
        }

        Stack<Integer> s3 = new Stack<>();
        while(!s2.isEmpty()){
            s3.push(s2.pop());
        }

        while(!s1.isEmpty() && !s3.isEmpty()){
            int x = s3.peek();
            int y = s1.peek();
            if(x > y){
                System.out.print(1+" ");
                s1.pop();
            }
            else if(y > x){
                System.out.print(2+" ");
                s3.pop();
            }
            else{
                System.out.print(0+" ");
                s1.pop();
                s3.pop();
            }
        }
    }
}