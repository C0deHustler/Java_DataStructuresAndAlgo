import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/codingAssignment/GETMINELEFST
// Explanation - https://www.prepbytes.com/blog/stacks/get-minimum-element-from-stack/  (useless explanation)
public class Prepbytes_Easy_GetMinimumElementFromStack {
    static int minEle;
    static Stack <Integer> s=new Stack<>();

    static void Push(int x)
    {
        if (s.isEmpty()==true) {
            s.push(x);
            minEle = x;
        }
        else if (x > minEle) {
            s.push(x);
        }
        // Important part
        else {
            s.push(2 * x - minEle);
            minEle = x;
        }
    }

    static void Pop()
    {
        if (s.isEmpty()==true) {
            System.out.println("-1");
        }
        else{
            // Important part
            int top = s.peek();
            if (top < minEle)
                minEle = 2 * minEle - top;
            s.pop();
        }
    }

    static int minimum()
    {
        if(!s.isEmpty()==true)
            return minEle;
        else
            return -1;
    }
    static int Top()
    {
        if(s.isEmpty()==true)
            return -1;
        else{
            // Important part
            int t = s.peek(); // Top element.
            return (t < minEle)? minEle:t;  // If t < minEle, it means minEle stores value of t.
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int k=sc.nextInt();
            if(k==1){
                int x=sc.nextInt();
                Push(x);
            }

            else if(k==2)
                Pop();
            else if(k==3)
                System.out.println(Top());
            else if(k==4)
                System.out.println(minimum());
        }
    }
}
